import java.util.Scanner;
public class input
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("number u enter is even number");

        }else

        {
            System.out.println("number u enter is odd number");
        }
        sc.close();
    }
}