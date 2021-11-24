//Recursion Basic

import java.util.*;

import javax.sound.midi.Synthesizer;
public class a3 {
  public static void main(String[] args) {
      System.out.println("Hlo");
      //a3 obj =new a3();
      Scanner aman=new Scanner(System.in);
      int n=aman.nextInt();
      printNum(n);
      System.out.println("******");
      int n1=aman.nextInt();
      printNum1(n1);

      
  }   
 public static void printNum(int n){
    if(n==0){
   return;
   }
      System.out.println(n);
      printNum(n-1);

    }
    public static void printNum1(int a){
        if(a==6){
       return;
       }
      System.out.println(a);
      printNum1(a+1);
    
    }
}
