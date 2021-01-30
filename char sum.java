import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     int sum=0;
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();         
    char a[]=n.toCharArray();    
     for(int i=0;i<n.length();i++){
         int c=a[i]-96;
         sum=sum+c;
     }
     System.out.print(sum);
    }
}
