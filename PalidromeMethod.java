import java.util.Scanner;

class PalindromeMethod{

    //static int n;
    static void enterNumber(int n){
        int sum =0;
            int temp=0;
            int r;
            temp=n;
        while(n>0){
            
            
            r=n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
    public static void main(String[] args) {
        enterNumber(45);
    }
}