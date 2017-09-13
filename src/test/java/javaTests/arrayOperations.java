package javaTests;

import com.google.common.primitives.Ints;
import org.junit.Test;
import java.util.Arrays;
import java.util.stream.*;

public class arrayOperations {

    private int[] uniquePlusrandom = {5,9,2,0,6};

    @Test
    public void getIndexOfSix(){
        int sixtus = 6;
        System.out.println(Ints.indexOf(uniquePlusrandom, sixtus));
    }

    @Test
    public void summation(){
        int summary = IntStream.of(uniquePlusrandom).sum();
        System.out.println("The sum is " + summary);
    }

    @Test
    public void sorting(){
        Arrays.sort(uniquePlusrandom);
        System.out.println(Arrays.toString(uniquePlusrandom));
    }

}
