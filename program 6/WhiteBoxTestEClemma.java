public class tri {
public  String op(int a,int b, int c){

int o=1;
do{
if(a>=1 && a<=200 && b>=1 && b<=200 && c>=1 && c<=200)
{
if(a<b+c && b<c+a && c<a+b )
{
if(a==b && b==c){
return("Equilateral Triangle");
}
else if(a==b ||b==c || c==a ){
return("Isosceles Triangle");
}
else{
return("Scalene Triangle");
}
}
else{
return("Not a Triangle");
}
}
else{
return("Invalid");
}
}while(o!=2);

}
}
