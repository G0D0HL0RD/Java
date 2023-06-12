import java.util.ArrayList;
import java.util.List;

public class FindRange {
    public static void main(String[] args) {
        int arr[]= {0,1,2,4,5,7};
        FindRange ob = new FindRange();
        System.out.println(ob.findRange(arr));
    }
    public List<String> findRange(int a[]){
        List<String> ls = new ArrayList<>();
        if(a.length<1){
            return ls;
        }
        int j=0,i=0;
        for(i=0;i<a.length-1;i++){
            if(a[i+1]==a[i]+1)
            continue;
            else{
                String s1=String.valueOf(a[j]);
                String s2=String.valueOf(a[i]);
                if(s1.equals(s2)){
                    ls.add(s1);
                }
                else{
                    ls.add(s1+"->"+s2);
                }
                j=i+1;
            }
        }
        String s3=String.valueOf(a[j]);
        String s4=String.valueOf(a[i]);
        if(s3.equals(s4)){
            ls.add(s3);
        }
        else{
            ls.add(s3+"->"+s4);
        }
        return ls;
    }
}
