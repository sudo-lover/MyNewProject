class fibonacci{

    public static void main(String[] args){
        int i=0;
        int j=1;
        int k;
        int p;
        int n=10;
        System.out.print(i + " "+ j);

        for (p=0; p<n;p++){
            k=i+j;
            System.out.print(" "+k);
            i=j;
            j=k;
            
        }
        

    }
}