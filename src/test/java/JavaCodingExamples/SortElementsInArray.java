package JavaCodingExamples;

import java.util.Arrays;

public class SortElementsInArray {

    public static void main(String[] args) {

           int[] arr = {50,20,90,30,100,10};

           int n= arr.length-1;

           for(int i=0;i<n;i++){  //n=5 no of passes

               for (int j=0;j<n;j++){ //iteration

                     if(arr[j] > arr[j+1]){
                         int temp = arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1] = temp;
                     }
               }
           }
        System.out.println(Arrays.toString(arr));

    }
}

class SortElementsInDescArray {

    public static void main(String[] args) {

        int[] arr = {50,20,90,30,100,10};

        int n= arr.length-1;

        for(int i=0;i<n;i++){  //n=5 no of passes

            for (int j=0;j<n;j++){ //iteration

                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
