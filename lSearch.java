import java.util.Arrays;

class lSearch{
    public static void main(String[] args) {
        //int [] arr={};
        int[] arr={10,20,30,40,50};
        int ans= linearSearch(arr, 20);
        if(ans!=-1)
        System.out.println("Found at Index : "+ans);
        else
        System.out.println("Not found");

        int ans1=searchString("Arjun", 'a');
        if(ans1!=-1)
        System.out.println("Found at Index : "+ans1);
        else
        System.out.println("Not found");

        String name = "Malhotra";
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static int linearSearch(int[] arr, int n){
        if (arr.length==0){
            return -1;
        }
        //This returns the value 
        // for (int i:arr){
        //     if (i==n){
        //         return i;
        //     }
        // }

        //This returns Index Number
        for (int i=0; i<arr.length;i++){
            if (arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    static int searchString(String s, char ch){
        if(s.length()==0){
            return -1;
        }
      //  for(char c:s.toCharArray()){  
      //      if(c==ch){
      //          return true;
      //      }
      //  }
      //  return false;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}