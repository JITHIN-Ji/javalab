import java.util.Scanner;

class Area
{
        double area(double r)
        {
        return(3.14*r*r);
        }
        float area(float s)
        {
         return(s*s);
        }
        float area(float l,float b)
        {
        return(l*b);
        }
        double area(double b1,double h)
        {
        return(0.5*b1*h);
        }
        public static void main(String[] args)
        {             
                Scanner sc=new Scanner(System.in);
                Area g=new Area();      
                System.out.println("Enter the value of radius of circle");
                System.out.println();
                double r=sc.nextDouble();
                System.out.println("Area of circle =" +g.area(r));

                System.out.println("Enter the value for side of square");
                System.out.println();
                float s=sc.nextFloat();
                System.out.println("Area of square =" +g.area(s));

                System.out.println("Enter the value of lenght and breath of rectangle");
                System.out.println();
                float l=sc.nextFloat();
                float b=sc.nextFloat();
                System.out.println("Area of rectangle =" +g.area(l,b));
                        
                System.out.println("Enter the value of breath and height of triangle");
                System.out.println();
                double b1=sc.nextFloat();
                double h=sc.nextFloat();
                System.out.println("Area of triangle =" +g.area(b1,h));
        }
}
