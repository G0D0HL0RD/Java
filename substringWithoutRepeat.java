import java.util.HashSet;
import java.util.Set;
public class substringWithoutRepeat {
    public static void main(String[] args) {
        String s = "abeabjaamoin";
        Set<Character> set = new HashSet<>();
        int size =0,j=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                size = Math.max(size, i-j+1);
            }
            else{
                while(s.charAt(j)!=s.charAt(i)){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.remove(s.charAt(j));
                j++;
                set.add(s.charAt(i));
            }
        }
        System.out.println(size);
    }
}
