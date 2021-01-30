import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
         int i=1;
         long fact=1;              
        int n=s.nextInt();
        while(i<=n){
           fact=fact*i;
           i++;
        }
        System.out.println(fact);
        }
    }
