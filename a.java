import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class a {
    //Array List objects ka hota hai 
    //whereas array objects + Primitve data types

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
       // ArrayList<String> list2=new ArrayList<>();
       // ArrayList<Boolean> list3=new ArrayList<>();
       list.add(0);  // Add krne k liye DOT ADD method use krlo
       list.add(2);
       list.add(5);
       list.add(75);
       System.out.println(list);
       int element= list.get(3); // Get krne k liye DOT GET ,,     ,,   ,,
       System.out.println(element);
       list.add(3,41);        //add element in betweeen k liye .add  then index, element value
       System.out.println(list);
       System.out.println(list.size());
       list.set(1,411); //set element k liye .set  then index, element value
       System.out.println(list);
        list.remove(2);  //Delete element k liye .remove  then index
        System.out.println(list);
       System.out.println(list.size()); //Size lena ho array list ka to .size()

       for(int i=0; i<list.size();i++){
           System.out.print(list.get(i)+" ");
       }

        System.out.println();
       //Array List mei ek optimised sort function exist krta hai
       //Collections Sort: Collection ek class hai jismei sort nam ka ek function hota hai

       Collections.sort(list);
       System.out.println(list);


       Scanner aman=new Scanner(System.in);
       ArrayList<ArrayList<Integer>> list4=new ArrayList<>();
       for (int i=0;i<3;i++){
           list4.add(new ArrayList<>());
       }
       for (int i=0; i<3;i++){
           for (int j=0; j<3;j ++){
               list4.get(i).add(aman.nextInt());
           }
       }
       System.out.println(list4);

    }
}
