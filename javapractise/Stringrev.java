public class Stringrev {
        public static void main(String[] args) {
            String original = "Hello, World!";
            String reversed = reverseString(original);
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }
    
        public static String reverseString(String s) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString();
        }

    }
    
