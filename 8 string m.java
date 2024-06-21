import java.util.*;
class StringM
{
public static void main(String []args)
{
    String value;
    System.out.println( "Enter the string: ");
    Scanner sc=new Scanner(System.in);
value=sc.nextLine();
System.out.println( "String Length is : " + value.length());
System.out.println("String concatination : " +value.concat("Concated"));
System.out.println("Index of character 'a': " + value.indexOf('a'));
System.out.println("Character at 2nd position: " + value.charAt(1));
System.out.println("Convert to LowerCase: " + value.toLowerCase());
System.out.println("Convert to UpperCase: " + value.toUpperCase());
}
}
