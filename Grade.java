import java.util.Scanner;
class Grade
{
      public static void main(String args[])
      {
       int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the percentage:");
       num=sc.nextInt();
       if(num>90){
            System.out.print("Grade is A");
         }else if(num>80){
               System.out.print("Grade is B");
          }
         else if(num>60){
                System.out.print("Grade is C");}
        else if(num>50){
                    System.out.print("Grade is D");}
         else{
                  System.out.print("Student Failed");}
}        
}