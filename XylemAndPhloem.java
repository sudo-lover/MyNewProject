import java.util.Scanner;

class XylemAndPhloem{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int su_ext=0;
            int sum =0;
            int len = String.valueOf(n).length();
            int r = n%10;
            int x= (int)Math.pow(10, len-1);
            int y = n/x;
            su_ext = r+y;
            
            for (int i=0; i<= len; i++){
                int z = n%10;
                sum = sum+z;
                n=n/10;


            }
            sum = sum-y-r;
            
            

            if (sum == su_ext){
                System.out.println("Xylem");
            }
            else{
                System.out.println("Phloem");
            }
            



        }
    }

