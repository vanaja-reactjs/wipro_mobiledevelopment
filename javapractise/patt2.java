public class patt2 {
    public static void main(String[] args)
{
    int n = 10;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                continue;
            }
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
}    
}
