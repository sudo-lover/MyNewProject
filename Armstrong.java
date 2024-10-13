import java.util.*;

class Armstrong{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String l = String.valueOf(n);
        int len = l.length();
        int sum=0;
        int temp;
        temp=n;
        //int r;
        //int power = 0;
        for (int i =1; i<=len; i++){
           int r= (n%((int)Math.pow(10,i)))/(int) Math.pow(10, i-1);
           int power = (int)Math.pow(r, len);
            sum+=power;
            //n=n/10;


        }
        if(temp==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }


    }
}