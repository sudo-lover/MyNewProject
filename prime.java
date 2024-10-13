import java.util.Scanner;

class prime{
    public static void main(String[] args) {
        int count =0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                
                count++;
            }

        }
        if (count == 1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        scan.close();
    }
}