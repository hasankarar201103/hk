import java.io.*;
public class sum
{
public static void main(string args[])throws IOExceotion
{
string s1,s2;
loop1:
for(;;)
{
BufferedReader BR=new inputStreamReader(new inputStreamReader(System).in);
System.out.println("Enter two numbers");
s1=BR.readline();
s2=BR.readline();
x=integer.parselnt(s1);
y=integer.parselnt(s2);
if(x<0||y<0)
{
system.out.print("wrong input(enter again)");
continue loop1;
}
else
{
z=x+y;
System.out.println("The summation a is:="+z);
break loop1;
}
}
}
}