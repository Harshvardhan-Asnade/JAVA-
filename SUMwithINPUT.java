import java.util.*;
public class SumWithInput{
    public static void main (String[] args) {
   Scanner x =new Scanner(System.in);
   System.out.println("Enter the vaule of a: ");
   int a = x.nextInt();
   System.out.println(a);   
   System.out.println("Enter the vaule of B: ");
   int c = x.nextInt();
   System.out.println(c);
   int sum = a+c;
   System.out.println("SUM is "+sum);
  }
}
