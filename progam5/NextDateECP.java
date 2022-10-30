package nextdate;

public class nextdate
{
public static String next(int d, int m, int y, int cc)
{
if(d==cc)
{
d=1;
if(m==12)
{
y++;
m=1;
}
else
{
m++;
}
}
else
{
d++;
}
return(String.valueOf(d)+"/"+String.valueOf(m)+"/"+String.valueOf(y));
}
public String nextday(int d, int m, int y)
{
if(d>=1 && d<=31 && m>=1 && m<=12 && y>=1812 && y<=2012)
{
switch(m)
{
case 1:
case 3:return(next(d,m,y,31));
case 5:return(next(d,m,y,31));
case 7:return(next(d,m,y,31));
case 8:return(next(d,m,y,31));
case 10:return(next(d,m,y,31));
case 12: return(next(d,m,y,31));
case 4: return(next(d,m,y,30));
case 6: return(next(d,m,y,30));
case 9: return(next(d,m,y,30));
case 11: return(next(d,m,y,30));
default: return(next(d,m,y,((y%4==0 && y%100!=0) || y%400==0)?29:28));
}
}
return "Invalid Values";
}
}
