package imolcean.study.algorithms;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort<T extends Comparable<T>> extends AbstractSort<T>
{
    @Override
    public T[] sort(T[] arr)
    {
        PriorityQueue<T> heap = new PriorityQueue<>(Arrays.asList(arr));

        T[] data = arr.clone();
        for(int i = 0; i < data.length; i++)
        {
            data[i] = heap.poll();
        }

        return data;
    }
}
