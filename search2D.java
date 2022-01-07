import java.util.Arrays;
import java.util.Scanner;

public class search2D {
    public static void main(String[] args) {
Scanner aman = new Scanner(System.in);
int [][] ar=new int[3][4];  //ar.length rows dega i.e 3
    //input
    for (int rows=0; rows<ar.length;rows++){
        for (int colm=0; colm<ar[rows].length;colm++){
            ar[rows][colm]=aman.nextInt();
        }
    }
    for (int[] a : ar){
        System.out.println(Arrays.toString(a));
    }
    int n=10;

    int[] ans=search(ar,n);
    System.out.println("Target "+n+ " found at Index: "+Arrays.toString(ans));

    System.out.println("Max value of 2D Array : "+ max(ar));

  

}

    static int[] search(int[][] ar, int target){
        for (int rows=0; rows<ar.length;rows++){
            for (int colm=0; colm<ar[rows].length;colm++){
               if (ar[rows][colm]==target){
                   return new int[]{rows, colm};
               }
               
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] ar){
        int max= Integer.MIN_VALUE;
        for (int rows=0; rows<ar.length;rows++){
            for (int colm=0; colm<ar[rows].length;colm++){
               if (ar[rows][colm]>max){
                   max=ar[rows][colm];
               }
               
            }
        }
        return max;
    }
    
}

