import java.util.*;

class ReversingStringUsingStringBuilder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
        

    }
}