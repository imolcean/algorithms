package imolcean.study.algorithms;

public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T>
{
    @Override
    public T[] sort(T[] arr)
    {
        T[] data = arr.clone();

        boolean bubbled;

        do
        {
            bubbled = false;

            for(int i = 0; i < data.length - 1; i++)
            {
                if(data[i].compareTo(data[i + 1]) > 0)
                {
                    swap(data, i, i + 1);
                    bubbled = true;
                }
            }
        }
        while(bubbled);

        return data;
    }
}
