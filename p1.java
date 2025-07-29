import java.util.Scanner;
class p1{
public static void main(String[] args)
{
char c;
int a,b,result;
Scanner sc=new Scanner(System.in);
System.out.println("Sarumathi S(2024503551");
System.out.println("entera and b value:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter operator:");
c=sc.next().charAt(0);
switch(c){
case '+':
result=a+b;
System.out.println("a+b="+result);
break:
case '-':
result=a-b;
System.out.println("a-b="+result);
break;
case '*':
result=a*b;
System.out.println("a*b="+result);
break;
case '/':
System.out.println("a/b="+rsult);
break;
default:
System.out.println("invalid operator");
break;
}}}
  