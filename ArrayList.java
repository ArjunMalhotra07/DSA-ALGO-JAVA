import java.util.Arrays;

public class ArrayList {
        public static void main(String[] args) {
            int[] arr={898,89,7,98,2,5,10,330,40};
            print(arr);
            swap(arr,1,3);
            int c= max(arr);
            System.out.println("Max value "+c);
            int c1= maxRange(arr, 2,8);
            System.out.println("Max value in range [2,8] "+c1);
            reverse(arr);
            System.out.println("Reversed array ");
            print(arr);    
            
        }
        static void reverse(int[] arr ){
            int start=0;
            int end=arr.length-1;

            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        static void swap(int[] arr, int index1, int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
            
        }
        static void print(int[] arr){
         //   for(int i=0;i<arr.length;i++){
         //       System.out.print(arr[i]+" ");
         //   }
         //   System.out.println();
            //or
            System.out.println(Arrays.toString(arr));
        }

        static int max(int[] arr){
            int max=arr[0];
            for(int i=1;i<arr.length;i++){
              if (arr[i]>max){
                max= arr[i];
                
              }
            }
            return max;
        }

        static int maxRange(int[] arr,int start, int end){
            int max=arr[start];
            for(int i=1;i<=end;i++){
              if (arr[i]>max){
                max= arr[i];
                
              }
            }
            return max;
        }

}
