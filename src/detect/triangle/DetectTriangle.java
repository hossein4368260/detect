

package detect.triangle;

import java.util.Scanner;

/**
 *
 * @author Mozafari
 */
public class DetectTriangle 
{


    
    public static void main(String[] args) {
Scanner getnumber=new Scanner(System.in);
int a=getnumber.nextInt();
int b=getnumber.nextInt();
int c=getnumber.nextInt();
//tavan dowom addad
int powa=(int)Math.pow(a, 2);
int powb=(int)Math.pow(b, 2);
int powc=(int)Math.pow(c, 2);      




if(a+b>c & a+c>b & b+c>a)
{
System.out.println("تشکیل مثلث هست"); //shart 1



if(a==b & a==c & b==c)
{
    System.out.println(" اضلاع باهم برابر است");//shart 2
}

if(powa+powb==powc || powa+powc==powb || powb+powc==powa)
{
   System.out.println("مثلث قائم الزاویه"); //shart 3
}
 
else 
{
       System.out.println("مختلف اضلاع"); //shart 4
}
 
}
 
 
 else
{
System.out.println(" تشکیل مثلث نمی دهد");
System.exit(0);
}






}
    
}
