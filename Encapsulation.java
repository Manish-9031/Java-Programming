
                                                   // INCAPSULATION IN Java//
                                                   // incapsulation is the concept of deta hiding and abstraction //
import java.util.Scanner;
class Bank{
    private int blance =50000;  // Private deta type.
    private int psw;          // Private integer deta type.


    public void deposite(int money){
        System.out.print("Enter password:-");
        Scanner s=new Scanner(System.in);
        psw=s.nextInt();
        if(psw==123){
            blance=blance+money;
            System.out.println("Deposite money"+money);
            System.out.println("Total Blance:-"+blance);
        }
        else{
            System.out.println("Incorrect Password ........");
        }
    }
    public void withdrow(int money){
        System.out.print("Enter Password:-");
        Scanner s=new Scanner(System.in);
        psw=s.nextInt();
        if(psw==123){
            blance=blance-money;
            System.out.println("Withwrod Money:-"+money);
            System.out.println("Total blance:-"+blance);
        }
        else{
            System.out.print("Incorrect Password");
        }
    }
    public void cheak(){
        System.out.print("Enter Password");
        Scanner s=new Scanner(System.in);
        psw=s.nextInt();
        if(psw==123){
            System.out.print("Your Blance:-"+blance);
        }
        else{
            System.out.println("Incorrect password");
        }
    }
}
class customer{

    public static void main(String[] args) {
        Bank o=new Bank();
         int ch;
        System.out.println("1. Deposite Money ");
        System.out.println("2. Withdrow Money ");
        System.out.println("3. Cheak Blance ");

        System.out.println("Enter Your Choice ");
        Scanner s1=new Scanner(System.in);
        ch=s1.nextInt();
        switch(ch){
            case 1:
            o.deposite(2000);
            break;
            case 2:
            o.withdrow(3000);
            break;
            case 3:
            o.cheak();
            default:
            System.out.print("Invalled choice");
            break;
        }
    }
}