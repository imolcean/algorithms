package imolcean.study.algorithms;

class MergeSortTest extends AbstractSortTest
{
    MergeSortTest()
    {
        super(new MergeSort<>(Integer.class), new MergeSort<>(String.class));
    }
}
