import java.util.Scanner;
class Exp6
{

  public static void main(String[] args)
{
     Scanner sc = new Scanner(System.in);

     System.out.println("enter first number");
     int num1 = sc.nextInt();

     System.out.println("enter second number");
     int num2 = sc.nextInt();

     System.out.println("enter third number");
     int num3 = sc.nextInt();

     System.out.println("Choose operation(1.Add 2.Subtract 3.Multipy):");
     int opt = sc.nextInt();
  
     switch(opt)
{
    case 1: System.out.println("Result :" +(num1+num2));
    break;
    
    case 2: System.out.println("Result :" +(num1-num2));
    break;
    
    case 1: System.out.println("Result :" +(num1*num2));
    break;
   
   default: System.out.println("Invalid option");
}
}
}
}