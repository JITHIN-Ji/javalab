import java.util.*;
class Search
{
public static void main(String[] args)
{
int i,j,x=0;
boolean state=false;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elemenyts in array:");
int num=sc.nextInt();
String word[]=new String[num];
sc.nextLine();
for(i=0;i<num;i++)
{
System.out.println("Enter a word:");
word[i]=sc.nextLine();
}
System.out.println("Enter the element to be searched:");
String search=sc.nextLine();
for(i=0;i<num;i++)
{
if(word[i].equals(search))
{
x=i;
state= true;
}
}
if(state)
{
System.out.println("Element found at position="+x);
}
else
{
System.out.println("Element not found");
}
}
}
