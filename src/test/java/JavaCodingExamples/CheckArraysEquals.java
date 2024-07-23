package JavaCodingExamples;

public class CheckArraysEquals {

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

       /* boolean value = Arrays.equals(a1,a2);
        if(value==true){
            System.out.println("Arrays are Equal");
        }
        else System.out.println("Arrays are NOT Equal");*/


       boolean status = true;

       if(a1.length==a2.length){
           for(int i=0;i<a1.length;i++){
               if(a1[i] !=a2[i]){
                   status=false;
               }
           }

       }
       else status= false;

       if(status){
           System.out.println("Arrays are Equal");
       } else System.out.println("Arrays are NOT Equal");
    }
}
