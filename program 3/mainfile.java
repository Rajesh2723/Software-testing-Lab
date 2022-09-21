package rajpro3;

public class Trianglejunit {
public String check(int a,int b,int c){
if((a>=1 && a<=200) && (b>=1 && b<=200) && (c>=1 && c<=200))
if((a+b>c)&&(b+c>a)&&(c+a>b))
{
if(a==b && b==c) return ("Equilateral");
else if(a==b||b==c||c==a) return ("Isosceles");
else return ("Scalene");
}
else return ("Not a triangle");
return ("Invalid values");
}
/*public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Trianglejunit t = new Trianglejunit();

System.out.println("Enter 3 sides");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
System.out.println(t.check(a, b, c));


}*/

}
