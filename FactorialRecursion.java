class FactorialRecursion{

    static int factRecur(int n){
        
       // int fact =1;
        if(n==0){
            return 1;
        }
        else{
            return (n*(factRecur(n-1)));
        }


    }
    public static void main(String[] args) {
        int fact =1;
        int num = 0;
        fact = factRecur(num);
        System.out.println(fact);
    }

}