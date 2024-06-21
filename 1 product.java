import java.util.*;
class ProductDetails
{
		String pname;
		int pcode;
		int price;
		ProductDetails(String pname,int pcode,int price)
		{
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
		}
		void display()
		{
		System.out.println(pcode+"\t"+pname+"\t"+price);
		}
		void lowest(int p1, int p2,int p3)
		{
		if(p1<p2 && p1<p3)
			{
			System.out.println("Product 1 is has the lowest price,"+p1);
			}
		else if(p2<p1 && p2<p3)
			{
			System.out.println("Product 2 has the lowest price,"+p2);
			}
		else
			{
			System.out.println("Product 3 has the lowest price,"+p3);
			}
			
		}
}
class Product
{
public static void main(String args[])
	{
	ProductDetails ob1=new ProductDetails("Apple",101,100);
	ProductDetails ob2=new ProductDetails("Banana",102,90);
	ProductDetails ob3=new ProductDetails("Orange",103,80);
	System.out.println("Product Information:");
	ob1.display();
	ob2.display();
	ob3.display();
	ob1.lowest(ob1.price,ob2.price,ob3.price);
	}
}
