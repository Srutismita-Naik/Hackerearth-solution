import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       String rev="";
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();      
       for(int i=n.length()-1;i>=0;i--){
           rev=rev+n.charAt(i); } 
        if(n.equals(rev)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
      
    }
}
