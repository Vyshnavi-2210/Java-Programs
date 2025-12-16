import java.util.Scanner;
class AddNumber
{
      public static void main(String args[])
      {
             int num1,num2,sum;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter first no:");
             num1=sc.nextInt();
             System.out.println("Enter Second no:");
             num2=sc.nextInt();
             sum=num1+num2;
             System.out.println("The sum of given numbers " +num1+"and "+num2+"is "+sum);
       }
}