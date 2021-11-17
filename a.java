import java.util.ArrayList;
import java.util.Collections;

public class a {
    //Array List objects ka hota hai 
    //whereas array objects + Primitve data types

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
       // ArrayList<String> list2=new ArrayList<>();
       // ArrayList<Boolean> list3=new ArrayList<>();


       // Add krne k liye DOT ADD method use krlo
       list.add(0);
       list.add(2);
       list.add(5);
       list.add(75);
       System.out.println(list);


       // Get krne k liye DOT GET ,,     ,,   ,,
       int element= list.get(3);
       System.out.println(element);

       //add element in betweeen k liye .add  then index, element value
       list.add(3,41);
       System.out.println(list);
       System.out.println(list.size());
       //set element k liye .set  then index, element value
       list.set(1,411);
       System.out.println(list);

       //Delete element k liye .remove  then index
        list.remove(2);
        System.out.println(list);

       //Size lena ho array list ka to .size()
       System.out.println(list.size());

       for(int i=0; i<list.size();i++){
           System.out.print(list.get(i)+" ");
       }

        System.out.println();
       //Array List mei ek optimised sort function exist krta hai
       //Collections Sort: Collection ek class hai jismei sort nam ka ek function hota hai

       Collections.sort(list);
       System.out.println(list);
    }
}
