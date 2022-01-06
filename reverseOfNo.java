import java.util.Scanner;
class reverseOfNo{
    public static void main(String[] args){
        Scanner aman= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=aman.nextInt();
        
        int sum=0;
        while(a > 0){
           int rem=a %10;
            
            a/=10;
            sum= sum*10+rem;
        }

        System.out.println("Reverse "+sum);
    }
}