import java.util.*;
public class Fibonacci{
    public static long fibonacci(int n,int t1,int t2){
        //n is trems of display, t1 and t2 is initialized to first two terms of the Fibonacci serie
		for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return t1;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Number you want to print:");
            int n= s.nextInt();
            if(n<=0){
                throw new Exception("number should not less or equal 0");
            }
            System.out.print(fibonacci(n, 1,1));

        }catch(InputMismatchException ex){
            System.out.print("Please input number!");
        }
        catch(Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}