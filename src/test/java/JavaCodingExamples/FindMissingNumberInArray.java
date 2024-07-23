package JavaCodingExamples;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] a= {1,2,3,4,5,7,8,9,10};

        int sum1=0;
        int sum2=0;

        for( int value:a){
            sum1 = sum1 +value;
        }

        for(int i=1;i<=10;i++){
            sum2 = sum2+i;
        }
        System.out.println("The missing number is "+ (sum2-sum1));
    }
}
