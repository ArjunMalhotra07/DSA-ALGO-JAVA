import java.util.Scanner;
class countOccurence{
    public static void main(String[] args){
        Scanner aman= new Scanner(System.in);
        System.out.println("Enter a number");
        int a=aman.nextInt();
        System.out.println("Which number's occurence do you want?");
        int b=aman.nextInt();
        int count=0;
        while(a > 0){
            int rem=a %10;
            if (rem==b){
                count ++;
            }
            a/=10;
        }
        System.out.println(b+ " comes "+count+" number of times");
    }
}