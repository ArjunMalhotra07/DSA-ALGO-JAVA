
import java.util.*;
class isArmstrong {
    public static void main(String[] args) {
       for (int i=100; i<999;i++){
        isArmstrong(i);
       } 
        
    }

    static void isArmstrong(int n){
        int original = n;
        int sum =0;
       // int rem=0;

        while( n >0){
           int rem= n%10;
            
            n/=10;
            sum+= Math.pow(rem,3);
        }
        if (sum == original){
            System.out.println(original + " Armstrong");
        }//else{
        //     System.out.println(original + " Not Armstrong");
        // }
    }
}
