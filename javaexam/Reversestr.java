public class Reversestr
{
    public static void main(String[] args){
        String ip="Hello world";
        String rev=reverseString(ip);
        System.out.println("Original      "+ip);
        System.out.println("revrse     "+rev);
    }
    public static String reverseString(String s){
        StringBuilder sc=new StringBuilder(s);
        sc.reverse();
        return sc.toString();
    }
}