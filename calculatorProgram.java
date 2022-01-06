import java.util.Scanner;
class calculatorProgram{
    public static void main(String[] args){
        Scanner aman= new Scanner(System.in);
       
        
       while (true){
        System.out.println("Enter Operand Sign +,-,*,/,% to Calculate; X or x to close the program");
           char ch=aman.next().trim().charAt(0);
            if (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                System.out.println("Enter 2 numbers");
                int a=aman.nextInt();
                int b=aman.nextInt();
            
            if (ch=='+'){
            System.out.println(a+b);
        }
        if (ch=='-'){
            System.out.println(a-b);
        }
        if (ch=='*'){
            System.out.println(a*b);
        }
        if (ch=='/'){
            if(b==0)
            System.out.println(b/a);
            else
            System.out.println(a/b);
        }
        if (ch=='%'){if(b==0)
            System.out.println(b%a);
            else
            System.out.println(a%b);
        }
        
        }
        else if (ch =='x' || ch =='X'){
            break;
        }
        else {
            System.out.println("Not valid input");
        }
    }
}
}