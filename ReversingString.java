import java.util.*;
class ReversingString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        int len = s.length();
        String reverse = "";

        for (int i = len-1; i>= 0; i--){
            reverse = reverse + s.charAt(i);

        }
        System.out.println(reverse);
    }
}