import java.util.*;
public class TestLanet1 {
    public static String StringChallenge(String str) {
        boolean flag=false;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==str.charAt(+3)) {
                flag=true;
            }
            if(flag==true) {
                return "true";
            } else {
                return "false";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TestLanet1 t1=new TestLanet1();
        System.out.println(t1.StringChallenge(sc.nextLine()));
    }
}