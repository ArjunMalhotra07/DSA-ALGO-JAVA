public class evenDigits {
    public static void main(String[] args) {
        int a=32;
       
        System.out.println((int)(Math.log10(a))+1); //1 step program
        int[] arr={56,2,987,4569,123,10};
        int ans=findNumbers(arr);
        System.out.println(ans);

    }
    static int findNumbers(int[] arr){
        int count=0;
        for (int num: arr){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    private static boolean even(int num) {
           String s= Integer.toString(num);
           if (s.length()%2==0){
               return true;
           } else
         return false;
    }



  //     Method II logic:  while(num>0){
  //                       count++;
  //                      num/=10;
  

}
