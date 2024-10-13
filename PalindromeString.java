import java.util.Scanner;

class PalindromString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String reverse="";
        int length = input.length();

        for(int i=length -1; i>=0; i--){
            reverse= reverse + input.charAt(i);
        }
            if(input.equals(reverse)){
                System.out.println("P");
            }
            else{
                System.out.println("np");
            }

        
    }
}