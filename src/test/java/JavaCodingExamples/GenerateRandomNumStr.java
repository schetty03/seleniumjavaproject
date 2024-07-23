package JavaCodingExamples;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNumStr {

    public static void main(String[] args) {


        Random rand = new Random();
        int number= rand.nextInt(10);
        System.out.println(number);

        System.out.println(rand.nextDouble());

        System.out.println(Math.random());

        RandomStringUtils.randomNumeric(10);
        RandomStringUtils.randomAlphabetic(5);

    }
}
