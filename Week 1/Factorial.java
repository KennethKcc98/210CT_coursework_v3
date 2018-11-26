import java.util.*;
public class Factorial{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);//define scanner
        int n = 0;//define n
        int m = 0;//define m
        
        try{
            System.out.print("Number 1(calculate factorial): ");
            n = s.nextInt();//user input to calculate factorial
            if(n>231){
                throw new Exception("number 1 should less than 231");
            }
            System.out.print("Answer is:"+factorial(n));
            System.out.println(" ");
            System.out.print("Number 2(Is this number can divides Number1?): ");
            m = s.nextInt();//user input to check is m can divides n!

            //use exception to handle input is or not less than 231
            if(m>231){
                throw new Exception("number 2 should less than 231");
            }

            //if m cannot divides by n!, print error message
            if (factorial(n)%m==0){
                System.out.println(m+" can divides "+n+"!");
            }else{
                System.out.println(m+" cannot divides "+n+"!");
            }
        }
        catch(InputMismatchException ex){
            /*InputMismatchException is mean thrown by a Scanner 
            to indicate that the token retrieved does not match 
            the pattern for the expected type, or that the token 
            is out of range for the expected type.
            reference: https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html*/
            System.out.println("Please input number!!");
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
    }

    public static long factorial(int n){
        long ans;
        if(n == 1|| n==0){//Because 0! and 1! is 1, return 1
            ans =1;
        }else{
            ans = n*factorial(n-1);
        }
        return ans;
    }
}