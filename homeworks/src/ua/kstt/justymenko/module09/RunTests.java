package ua.kstt.justymenko.module09;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by n1kropol on 5/27/17.
 */
public class RunTests {

    @Test
    public void testGetWords1(){
        String[] expected = {"cab", "abc", "cab", "cab", "bac", "bac"};
        String[] actual = TextUtils.getWords("cab; abc; cab; cab; bac; bac");
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetWords2(){
        String[] expected = {};
        String[] actual = TextUtils.getWords("");
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetWords3(){
        String[] expected = {};
        String[] actual = TextUtils.getWords(null);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetUniqueWords(){
        String[] expected = {"cab", "abc", "bac"};
        String[] actual = {"cab", "abc", "cab", "cab", "bac", "bac"};
        actual = TextUtils.getUniqueWords(actual);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortWords(){
        String[] expected = {"abc", "bac", "cab"};
        String[] actual = {"cab", "abc", "bac"};
        actual = TextUtils.sortWords(actual);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testGetUniqueSortedWords1(){
        String[] expected = {"abc", "bac", "cab"};
        String[] actual = TextUtils.getUniqueSortedWords("cab; abc; cab; cab; bac; bac");
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetUniqueSortedWords2(){
        String[] expected = {};
        String[] actual = TextUtils.getUniqueSortedWords(null);
        Assert.assertArrayEquals(expected, actual);
    }
}
