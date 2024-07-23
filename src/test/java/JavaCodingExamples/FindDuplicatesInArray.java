package JavaCodingExamples;

import java.util.HashSet;

public class FindDuplicatesInArray {

    public static void main(String[] args) {

        String[] arr= {"java","python","ruby","java"};
        boolean flag=false;

        for(int i=0;i<arr.length;i++){

            for(int j= i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate is Found"+ " " +arr[i]);
                    flag= true;
                }
            }
        }
        if(!flag){
            System.out.println("No Duplicates found");
        }
    }
}


 class FindDuplicateInArrayTwoMethod{

    public static void main(String[] args) {

        String[] arr= {"java","python","ruby","java"};
        boolean flag=false;
        HashSet <String> elements= new HashSet<>();

        for(String values:arr){

            if(!elements.add(values)){
                System.out.println("Duplicate is Found"+ " " +values);
                flag= true;
            }
        }
        if(!flag){
            System.out.println("No Duplicates found");
        }
    }

}