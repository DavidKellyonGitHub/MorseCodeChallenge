import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class NoiseRemoverTest {
    NoiseRemover remover = new NoiseRemover("XXXOO1");

    @Test
    public void removeNoiseTest() {
        remover.removeNoise();
        String expected = "XXXOO";
        String actual = remover.getCleanEncodedMessage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeNoiseTest2() {
        String expected = "XXXOO";
        remover.setEncodedMessage("1XXXOO");
        remover.removeNoise();
        String actual = remover.getCleanEncodedMessage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeNoiseTest3() {
        remover.setEncodedMessage("1XXXOO2");
        String expected = "XXXOO";
        remover.removeNoise();
        String actual = remover.getCleanEncodedMessage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeNoiseTest4() {
        remover.setEncodedMessage("XXXOO12");
        String expected = "XXXOO";
        remover.removeNoise();
        String actual = remover.getCleanEncodedMessage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEncodedOccurrences() {
        remover.setEncodedMessage("XXXOO1234");
        remover.getEncodedOccurrences();
        Assert.assertEquals((Integer) remover.getSignalSpaceNoiseOccurrencesMap().get("X"), (Integer) 3);
        Assert.assertEquals((Integer) remover.getSignalSpaceNoiseOccurrencesMap().get("O"), (Integer) 2);
        Assert.assertEquals((Integer) remover.getSignalSpaceNoiseOccurrencesMap().get("1"), (Integer) 1);
        Assert.assertEquals((Integer) remover.getSignalSpaceNoiseOccurrencesMap().get("2"), (Integer) 1);
        Assert.assertEquals((Integer) remover.getSignalSpaceNoiseOccurrencesMap().get("3"), (Integer) 1);
        Assert.assertEquals((Integer) remover.getSignalSpaceNoiseOccurrencesMap().get("4"), (Integer) 1);
    }

    @Test
    public void hasNoiseTest() {
        Assert.assertTrue(remover.hasNoise());
        remover.setEncodedMessage("XXOXOXOXOXXXXOXOXXOXXOXOOOOXOOXOO");
        Assert.assertFalse(remover.hasNoise());
    }

    @Test
    public void fieldMapToDescendingList() {
        remover.setEncodedMessage("XXXOO1234");
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(3, 2, 1, 1, 1, 1));
        remover.getEncodedOccurrences();
        ArrayList<Integer> actualList = remover.fieldMapToDescendingList();
        assertEquals(expectedList, actualList);

    }


    @Test
    public void identifyNoiseLetters() {
        remover.setEncodedMessage("XXXOO1234");
        remover.getEncodedOccurrences();
        HashSet<String> expected = new HashSet<String>(Arrays.asList("1", "2", "3", "4"));
        HashSet<String> actual = remover.identifyNoiseLetters();
        assertEquals(expected, actual);
    }
}