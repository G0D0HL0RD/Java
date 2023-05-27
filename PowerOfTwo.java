import java.util.*;
class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(n)); 
    }
    public boolean isPowerOfTwo(int n)
    {
        boolean flag = false;
        if((n&1)!=0 && n>1){
            return flag;
        }
        while(n>1 && (n&1)==0){
            n=n>>1;
        }
        if(n==1){
            flag=true;
        }
        return flag;
    }    
}