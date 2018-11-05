package imolcean.study.algorithms;

abstract class AbstractSort<T extends Comparable<T>> implements Sort<T>
{
    /**
     * Swaps two elements of an array.
     *
     * @param arr Array with the elements
     * @param idx1 Index of the first element
     * @param idx2 Index of the second element
     */
    void swap(T[] arr, int idx1, int idx2)
    {
        T tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}
