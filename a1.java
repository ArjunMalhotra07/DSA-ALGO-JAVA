//FIBONACCI series uptil N
import java.util.Scanner;

public class a1 {
    public static void main(String[] args){

        Scanner aman=new Scanner(System.in);
        int obj=aman.nextInt();

        int x=0;
        int y=1;
        int z=0;
        
       while(z<=obj){
           
        System.out.print(z + " ");
        x=y;
        y=z;
        z=x+y;

       }
    }
}

