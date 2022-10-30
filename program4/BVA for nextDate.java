package SoftwareTeest;

public class NextDate {
public static String check(int month, int day, int year)
{
if(day<1 || day>31 || month<1 || month>12 || year<1812 || year>2012)
{
return "Invalid Date";
}
int tom_day = day;
int tom_month = month; int tom_year = year;
if(ThirtyOneday(month))
{
if(day<31) tom_day = day+1; else
{
tom_day = 1; tom_month = month+1;
}
}
else if(Thirtyday(month))
{
if(day<30)
tom_day = day+1;
else if(day==30)
{
tom_day = 1;
tom_month = month+1;
}
else
return "Invalid date";
}
else if(december(month))
{
if(day<31)
tom_day = day+1;
else
{
tom_day = 1;
tom_month = 1;

if (year==2012)
return "Invalid Date";
else
tom_year=year+1;
}
}
else if(febraury(month))
{
if(day<28)
tom_day = day+1;
else
{
if(day==28)
{
if(leapyear(year))
tom_day=29;
else
{
tom_day = 1;
tom_month = 3;
}
}
else if(day == 29)
{
if(leapyear(year))
{
tom_day = 1;
tom_month = 3;
}
else
return "Invalid Date";
}
else if(day>29)
return "Invalid Date";
}
}
return tom_month+"/"+tom_day+"/"+tom_year;
}
private static boolean ThirtyOneday(int month)
{
return month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ;
}
private static boolean Thirtyday(int month)
{
return month==4 || month==6 || month==9 || month==11 ;
}
private static boolean december(int month)
{
return month==12 ;
}
private static boolean febraury(int month)
{
return month==2 ;
}
private static boolean leapyear(int year)
{
if((year%100)==0)
return(year%400==0);
else
return(year%4==0);
}
}
