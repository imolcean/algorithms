package imolcean.study.algorithms;

import java.util.Arrays;

public class SelectionSort<T extends Comparable<T>> implements Sort<T>
{
    public SelectionSort() {}

    /**
     * Swaps two integer array entries.
     */
    private void swap(T[] arr, int idx1, int idx2)
    {
        T tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    /**
     * Sorts data in ascending order.
     */
    @Override
    public T[] sort(T[] arr)
    {
        T[] data = Arrays.copyOf(arr, arr.length);

        for(int i = 0; i < data.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < data.length; j++)
            {
                if(data[j].compareTo(data[min]) < 0)
                {
                    min = j;
                }
            }

            swap(data, min, i);
        }

        return data;
    }
}
