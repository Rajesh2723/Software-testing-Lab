 package Code;
import java.util.*;
import java.io.*;

public class atm {

public static void main(String args[]) {
int Valid_PIN=1234;
int tries=0;
int choice=0;
double Balance=50000.00;
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to NHCE bank");
System.out.println("Please enter your Card");
System.out.println("Enter PIN: ");
int PIN=sc.nextInt();
while(PIN!=Valid_PIN && tries<2) {
System.out.println("Invalid PIN. Enter PIN again: ");
PIN=sc.nextInt();
tries+=1;
}
if(tries>=2) {
System.out.println("Card has been blocked. Please contact the bank for further Information");
}
if(PIN==Valid_PIN) {
System.out.println("Welcome User!!!");
System.out.println("Enter the type of Account:");
System.out.println("1. Savings");
System.out.println("2. Current");
int toa=sc.nextInt();
if(toa!=1) {
System.out.println("Invalid account type!!");
}
else {
System.out.println("\n\nnWhat would you like to do:");
while(choice!=4) {
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
choice=sc.nextInt();
if(choice==1) {
System.out.println("Balance: "+Balance);
}
else if(choice==2) {
System.out.println("Enter the amount to be added: ");
int amnt=sc.nextInt();
if(amnt>0) {
System.out.println("Transaction performed successfully!!!");
System.out.println("Balance: "+(Balance+amnt));
}
else {
System.out.println("Invalid amount");
}
}
else if(choice==3) {
System.out.println("Enter the amount to be withdrawn: ");
int amnt=sc.nextInt();
if(amnt<Balance) {
System.out.println("Transaction performed successfully!!!");
System.out.println("Balance: "+(Balance-amnt));
}
else {
System.out.println("Invalid amount");
}
}
else if(choice==4) {
System.out.println("Thank you for banking with us!");
}
else {
System.out.println("Invalid choice");
}
}
}
}
}
}
