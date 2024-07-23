package JavaCodingExamples;

public class RemoveJunk {


    public static void main(String[] args) {

        String s = "@$#^$$%&&% java &{P:{}:><? OOPS";

        String s1= s.replaceAll("[^a-zA-Z0-9\\s]","");

        String s2 = s.replaceAll("[^a-zA-Z0-9\\s]","");
        System.out.println(s1);
        System.out.println(s2);
    }
}
