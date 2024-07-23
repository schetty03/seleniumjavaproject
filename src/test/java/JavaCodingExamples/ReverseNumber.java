package JavaCodingExamples;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter the number");

       StringBuffer sb= new StringBuffer(String.valueOf(num));
        System.out.println( sb.reverse());

       StringBuilder sb1= new StringBuilder(String.valueOf(num));
        System.out.println(sb1.reverse());

    }
}


class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
       String a = sc.nextLine();
       int length= a.length();
       String reverse ="";

       for(int i=length-1;i>=0;i--) {
              reverse= reverse+a.charAt(i);
       }

        System.out.println(reverse);
        StringBuffer sb= new StringBuffer(a);
        System.out.println( sb.reverse());

        StringBuilder sb1= new StringBuilder(a);
        System.out.println(sb1.reverse());

    }
}