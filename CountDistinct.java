import java.util.*;
class CountDistinct{
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        int a[] = {5,10,15,5,4,5,15,20,20,25,13,10,5};

        for(int element:a){
            hs.add(element);
        }
        System.out.println("The total number of distinct elements in the array is: ");
        System.out.print(hs.size());

    }
}