package JavaCodingExamples;

import java.util.Scanner;

public class CountTheWords {

    public static void main(String[] args) {

        System.out.println("Enter the String");

        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();

        String[] words = s.split(" ");
        System.out.println("No.of words in the given string : "+ " " + words.length);
        System.out.println(s.length());
        int count=1;

          for(int i=0;i<s.length()-1;i++){

                 if((s.charAt(i)==' ')  && (s.charAt(i+1)!=' ')){
                     count++;
                 }
          }
        System.out.println("No.of words in the given string : "+ " " + count);

    }
}
