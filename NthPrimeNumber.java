import java.util.Scanner;

class NthPrimeNumber{
    public static void main(String[] args) {
        System.out.println("Enter the nth number to calculate the nth prime");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int num=1;
        int count =0;
        while(count<n){
            num+=1;
            for(i=2; i<=num; i++){
                if(num%i == 0){
                    break;}}
                    
                
                if(i==num){
                    count+=1;

                    
                }}
            
            System.out.println(num);
           
        }}

        

