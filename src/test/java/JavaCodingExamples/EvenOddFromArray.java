package JavaCodingExamples;

public class EvenOddFromArray {

    public static void main(String[] args) {

        int[] elements = {5,2,6,9};


        for(int value:elements){

            if(value % 2==0){
                System.out.println(value +" "+ "its even number");
            }
            else System.out.println(value +" "+ "its odd number");
        }
    }
}
