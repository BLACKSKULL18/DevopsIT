public class hello {
    public static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int num=5;
        int result=fact(num);
        System.out.println("Factorial of "+num+" is: "+result);
    }
}
