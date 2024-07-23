package JavaCodingExamples;

public class FactorialOfNumber {

    public static void main(String[] args) {

        int num=5;
        long factorial = 1;
        long fact=1;

        for (int i=num;i>=1;i--){

            factorial= factorial* i;

        }
        System.out.println("Factorial is : "+" "+ factorial );
        int i=1;
        while(i<=5){

            fact= fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
