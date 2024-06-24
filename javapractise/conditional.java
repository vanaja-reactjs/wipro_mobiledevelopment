import java.util.Scanner;
public class conditional
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greather than b");
        }
        else if(a<b)
        {
            System.out.println("a is lesstha b");
        }
        else
        {
            System.out.println("both are equal");
        }
        sc.close();


    }

}

    

