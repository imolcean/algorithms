package imolcean.study.algorithms;

public class QuickSort<T extends Comparable<T>> extends AbstractSort<T>
{
    private void quickSort(T[] arr, int left, int right)
    {
        int l = left;
        int r = right;

        int m = (l + r) / 2;

        while(l <= r)
        {
            while(arr[l].compareTo(arr[m]) < 0)
            {
                l++;
            }

            while(arr[r].compareTo(arr[m]) > 0)
            {
                r--;
            }

            if(l <= r)
            {
                swap(arr, l, r);

                l++;
                r--;
            }
        }

        if(left < r)
        {
            quickSort(arr, left, r);
        }

        if(right > l)
        {
            quickSort(arr, l, right);
        }
    }

    @Override
    public T[] sort(T[] arr)
    {
        if(arr.length < 1)
        {
            return arr;
        }

        T[] data = arr.clone();

        quickSort(data, 0, arr.length - 1);

        return data;
    }
}
