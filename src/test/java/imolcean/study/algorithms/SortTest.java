package imolcean.study.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

class SortTest
{
    private Sort<Integer> intSort;
    private Sort<String> strSort;

    @BeforeEach
    void setUp()
    {
        this.intSort = new MergeSort<>(Integer.class);
        this.strSort = new MergeSort<>(String.class);
    }

    @Test
    void sortEmptyIntegerArray()
    {
        Integer[] res = {};

        Integer[] in = {};

        Integer[] out = this.intSort.sort(in);

        assertArrayEquals(res, out);
    }

    @Test
    void sortSortedIntegerArray()
    {
        Integer[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Integer[] in = Arrays.copyOf(res, res.length);

        Integer[] out = this.intSort.sort(in);

        assertArrayEquals(res, out);
    }

    @Test
    void sortUnsortedIntegerArray()
    {
        Integer[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Integer[] in = {9, 1, 4, 6, 3, 5, 7, 8, 2};

        Integer[] out = this.intSort.sort(in);

        assertArrayEquals(res, out);
    }

    @Test
    void sortArrayWithIntegerCopies()
    {
        Integer[] res = {1, 1, 1, 2, 3, 4};

        Integer[] in = {4, 1, 1, 3, 2, 1};

        Integer[] out = this.intSort.sort(in);

        assertArrayEquals(res, out);
    }

    @Test
    void sortStringArray()
    {
        String[] res = {"", "A", "ZZTop", "ZZZ"};

        String[] in = {"ZZTop", "ZZZ", "A", ""};

        String[] out = this.strSort.sort(in);

        assertArrayEquals(res, out);
    }
}
