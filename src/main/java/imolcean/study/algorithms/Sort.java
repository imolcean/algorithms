package imolcean.study.algorithms;

public interface Sort<T extends Comparable<T>>
{
    /**
     * Returns a sorted copy of the original array.
     *
     * @param arr Array to sort
     * @return Sorted copy of the original array
     */
    T[] sort(T[] arr);
}
