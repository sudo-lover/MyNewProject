class fibonacciRecursion{

    static int i=0, j=1, k, p;
     static void printFibonacci(int count){
        if(count>0){
            k=i+j;
            System.out.print(" "+k);
            i=j;
            j=k;

            printFibonacci(count-1);

        }

        
    }
    public static void main(String[] args) {
       int count=10;
       System.out.print(i + " "+ j);
       printFibonacci(count-2);

    }
}