package JavaCodingExamples;

public class FindMaxAndMinInArray {

    public static void main(String[] args) {

        int[] a = {50,40,30,100,900,1000};

        int max =a[0];

        int min = a[0];

        for (int i=1; i<a.length;i++){

            if(a[i]> max){
                max= a[i];
            }

        }

        for(int j=1;j<a.length;j++){
            if(a[j]< min){
                min= a[j];
            }
        }

        System.out.println("The max value"+ max +" "+ "The Min value is "+ min );
    }
}
