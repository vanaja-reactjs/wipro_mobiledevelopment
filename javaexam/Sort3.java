import java.util.*;
public class Sort3 {

    public static String sortstr(String s){
        char temp[]=s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");

        String st=sc.nextLine();
        String st1=sortstr(st);
    System.out.println(st);
    System.out.println(st1);
    }
    
}
