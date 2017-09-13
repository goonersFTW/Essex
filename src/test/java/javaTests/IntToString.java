package javaTests;

import org.junit.Test;
import java.util.Random;

public class IntToString {

    @Test
    public void intToWords() {
        int myNum = RandNum();
        System.out.println("The number " + myNum + ", is spelt like this:" + converter(myNum) + ".");
    }

    private int RandNum() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) nums[i] = i;
        int rnd = new Random().nextInt(nums.length);
        return nums[rnd];
    }


    private final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private String converter(int number){
        String result;
        if (number % 100 < 20){
            result = numNames[number % 100];
            number /= 100;
        }
        else {
            result = numNames[number % 10];
            number /= 10;
            result = tensNames[number % 10] + result;
            number /= 10;
        }
        return result;
    }
}
