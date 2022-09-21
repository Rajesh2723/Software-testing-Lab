package Code;

import java.util.*;

public class triangle {
public static void main(String args[]) {
int a,b,c;
Scanner sc = new Scanner(System.in);

System.out.println("Enter side A of the triangle: \n");
a = sc.nextInt();

System.out.println("Enter side B of the triangle: \n");
b = sc.nextInt();

System.out.println("Enter side C of the triangle: \n");
c = sc.nextInt();

if(a==b && a==c && b==c) {
System.out.println("EQUILATERAL TRIANGLE \n");
}

else if(a==b || b==c || c==a) {
System.out.println("ISOCELES TRIANGLE \n");
}

else
{
System.out.println("SCALENE TRIANGLE \n");
}
}
}
