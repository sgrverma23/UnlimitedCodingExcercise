import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = new StringBuffer(A).reverse().toString();
        if(rev.equalsIgnoreCase(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
