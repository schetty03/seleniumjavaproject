package JavaCodingExamples;

public class SumOfElementsInArray {

    public static void main(String[] args) {

        int[] elements = {20,56,89,34};
        int sum =0;


            /* for(int i=0; i<=elements.length-1;i++){

                 sum= sum + elements[i];
             }*/
            for(int value: elements){
                sum= sum + value;
            }
        System.out.println(sum);
    }
}
