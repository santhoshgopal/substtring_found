import java.io.*;
import java.util.*;
public class substring_found
{
public static void main(String[] args)
{
int j=0,count=0,k=0,count1=0,fin=0;
Scanner in = new Scanner(System.in);
System.out.println("ENTER THE MAIN STRING");
String one=in.nextLine();
System.out.println("ENTER THE SUB STRING");
String two=in.nextLine();
int len1=one.length();
int len2=two.length();

char[] abc1=one.toCharArray();
char[] abc2=two.toCharArray();


for(int i=0;i<len1;i++)
{
	if(abc1[i]==abc2[k])
{
	while(k<len2)
	{
		if(abc1[i]==abc2[k])
		{
		i++;
		k++;
		count++;
		}
	}
	if(count==len2)
	{
	fin=i-len2;
	count1++;
	k=0;
	count=0;
	}
}
else
{
k=0;
count=0;
continue;
}
if(count1==1)
{
System.out.println(fin);
break;
}
 
	
}

if(count1==0)
{
System.out.println("-1");
}	
	



		

	}
}