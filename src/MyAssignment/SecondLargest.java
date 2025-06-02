package MyAssignment;

import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Integer[] array={12,5,20,15};
        List<Integer> list=new ArrayList<>(Arrays.asList(array));
        Collections.sort(list, Comparator.reverseOrder());
        if(list.size()>1){
            int SecondLargest=list.get(1);
            System.out.println("Second largest number is :"+SecondLargest);
        }else{
            System.out.println("not found");
        }
    }
}