package imolcean.study.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends AbstractSort<T>
{
    private Class<T> type;

    /**
     * Constructor takes runtime type information.
     *
     * @param type Type of the elements that have to be sorted
     */
    public MergeSort(Class<T> type)
    {
        this.type = type;
    }

    @SuppressWarnings("unchecked")
    private T[] merge(T[] left, T[] right)
    {
        T[] data = (T[]) Array.newInstance(this.type, left.length + right.length);

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length)
        {
            if(left[i].compareTo(right[j]) < 0)
            {
                data[k++] = left[i++];
            }
            else
            {
                data[k++] = right[j++];
            }
        }

        while(i < left.length)
        {
            data[k++] = left[i++];
        }

        while(j < right.length)
        {
            data[k++] = right[j++];
        }

        return data;
    }

    @Override
    public T[] sort(T[] arr)
    {
        if(arr.length <= 1)
        {
            return arr;
        }

        T[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        T[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        return merge(sort(left), sort(right));
    }
}
