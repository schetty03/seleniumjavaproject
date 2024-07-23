package JavaCodingExamples;

import java.util.Scanner;

public class CountCharOccurrence {

    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();

        System.out.println("Enter the character to find the occurrence in the String");
        Scanner sr = new Scanner(System.in);
        String character = sr.nextLine();

           int totalLength = s.length();

           int replacedLength = s.replace(character,"").length();
        System.out.println(totalLength);
        System.out.println(replacedLength);


        System.out.println("No of Occurrence of "+ character +" is : "+ " " + (totalLength - replacedLength));

      s.replace("a","");

    }
}
