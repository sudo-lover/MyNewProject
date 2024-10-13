import java.util.*;

class ReversingNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int temp;
        temp =n;
        int r;
        int sum=0;
        int len = String.valueOf(n).length();
        for(int i = 1; i<=len; i++){
            r=n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        System.out.println(sum);

    }
}