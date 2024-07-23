package JavaCodingExamples;

public class ReverseEachWordInAString {

    public static void main(String[] args) {

        ReverseEachWordInAString r = new ReverseEachWordInAString();
        String FinalReversedString = r.reverseString("Welcome To Java");

        System.out.println(FinalReversedString);



    }




    public String reverseString(String newString) {

        String[] words = newString.split(" ");
       // System.out.println(words[0]);

        String reverseStringg = "";

        for (String w : words) {

            String reverseWord = "";

            for (int i = w.length()-1; i >= 0; i--) {

                reverseWord = reverseWord + w.charAt(i);

            }

            reverseStringg = reverseStringg + reverseWord + " ";
        }



        String sentence1 = "Welcome To Java";

        String[] word1= sentence1.split(" ");
        System.out.println(word1.length);

        String reverseString1= "";

        for(String w: word1){
            String reverseWord= "";
            for(int j= w.length();j>=0;j--){
                reverseWord= reverseWord + w.charAt(j);

            }
            reverseString1 = reverseString1 +reverseWord + " ";
        }

        return reverseStringg;
    }




    }

