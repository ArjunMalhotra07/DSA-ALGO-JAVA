//Recursion Basic

import java.util.*;
public class a3 {
  public static void main(String[] args) {
      System.out.println("Hlo");
      //a3 obj =new a3();
      Scanner aman=new Scanner(System.in);
      int n=aman.nextInt();
      printNum(n);

      
  }   
 public static void printNum(int n){
    if(n==0){
   return;
   }
      System.out.println(n);
      printNum(n-1);

    }
}
