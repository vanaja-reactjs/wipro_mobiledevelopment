import java.util.Arrays;
public class Sortstring {
    public static String sortString(String inputstring){
        char temp[]=inputstring.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public static void main(String[] args){
        String is="hello world";
        String ss=sortString(is);
        System.err.println(is);
        System.out.println(ss);
    }
    
}
