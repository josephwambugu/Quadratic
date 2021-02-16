import java.util.Scanner;

public class QuadraticExpression {
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       // declaring variables.
       double a,b,c,disc =0,x1=0,x2 =0;
       a = sc.nextDouble();
       System.out.println("Enter the value af b:");
       b = sc.nextDouble();
       System.out.println("Enter the value af c");
      c = sc.nextDouble();
disc = Math.pow(b,2)-4*a*c;
if (disc >= 0){
   x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    x2 = (b-Math.sqrt(b*b-4*a*c))/(2*a);

    System.out.println("x1 ="+x1);
    System.out.println("x2 ="+x2);
}
else{
    System.out.println("There are no real roots");
}
   }
}