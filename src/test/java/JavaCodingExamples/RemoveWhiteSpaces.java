package JavaCodingExamples;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String s = "Java Programming selenium automation";

        String str = s.replaceAll("\\s","");

        String str1 = s.replaceAll("[\\s]","");

        System.out.println(str);
       // System.out.println(str1);
    }
}
