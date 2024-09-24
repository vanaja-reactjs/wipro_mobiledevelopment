import java.util.Scanner;
import java.util.*;

public class Sortstr1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char temp[]=str.toCharArray();
        Arrays.sort(temp);
        System.out.println(temp);
        sc.close();
    }
}
