class primeNumberUsingMethod{
    static int count =0;
    static void checkPrime(int n){
        if(n>0){
            for(int i=1; i<= Math.sqrt(n); i++){
                if(n%i ==0){
                    count++;
                }


            }
            if (count ==1){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
    public static void main(String[] args) {
        checkPrime(47);
    }
}