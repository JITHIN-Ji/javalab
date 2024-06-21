import java.util.*;

class Sort
{
 
    public static void main(String[] args)
    {
String str;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string value: ");
str = sc.nextLine();
char charArray[] = str.toCharArray();
Arrays.sort(charArray);
System.out.println(new String(charArray));

    }

}
