import java.util.*;
public class multiDimension

{
    public static void main(String[] args) {
          //  int [][] arr=new int[3][]; //1st is rows, 2nd is not necessary to specify 
          Scanner aman=new Scanner(System.in);

          int[][] arr={
                {45,50,55},
                {45,78,90,54},
                {123,456,1,600,500}
    };
    System.out.println(arr[2][1]);
    for (int rows=0; rows<arr.length;rows++){
        for (int colm=0; colm<arr[rows].length;colm++){
            System.out.print(arr[rows][colm]+" ");   
        }
        System.out.println();
    }
//OR
    for (int[] a : arr){
        System.out.println(Arrays.toString(a));
    }

    int [][] ar=new int[3][2];  //ar.length rows dega i.e 3
    //input
    for (int rows=0; rows<ar.length;rows++){
        for (int colm=0; colm<ar[rows].length;colm++){
            ar[rows][colm]=aman.nextInt();
        }
    }
    //output
    for (int rows=0; rows<ar.length;rows++){
        for (int colm=0; colm<ar[rows].length;colm++){
            System.out.print(ar[rows][colm]+" ");   
        }
        System.out.println();
    }
    //OR
    for (int[] a : ar){
        System.out.println(Arrays.toString(a));
    }
    }

    
}