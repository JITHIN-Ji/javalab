import java.util.*;
public class Complex 
{
void display(int r,int i)
{
    System.out.println(r+"+"+i+"i");
}
void add(int r1,int i1,int r2,int i2 )
{
        r1=r1+r2;
        i1=i1+i2;
        System.out.println("After Addition = "+r1+"+"+i1+"i");
}
public static void main(String[] args) 
{
    	Scanner sc =new Scanner(System.in);
        System.out.println("Enter the real part of first complex number:");
        int r1=sc.nextInt();
        System.out.println("Enter the imaginary part of first complex number:");
        int i1=sc.nextInt();;
        System.out.println("Enter the real part of second complex number:");
        int r2=sc.nextInt();
        System.out.println("Enter the imaginary part of second complex number:");
        int i2=sc.nextInt();
        Complex cp=new Complex();
        System.out.println("Complex Numbers are:");
        cp.display(r1,i1);
        cp.display(r2,i2);
        cp.add(r1,i1,r2,i2);
    }
    
}
