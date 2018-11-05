package imolcean.study.algorithms;

public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T>
{
    public SelectionSort() {}

    @Override
    public T[] sort(T[] arr)
    {
        T[] data = arr.clone();

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
