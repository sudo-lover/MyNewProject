import java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       // int q;
        int r;
        int sum =0;
        int temp;

        temp=n;
        while(n>0){
            r= n%10;
            
            sum = (sum*10)+r;
            n=n/10;
        }
        
        if(sum==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }


    }
}