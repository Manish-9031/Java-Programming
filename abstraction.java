                 // Abstraction program//

import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.xml.crypto.KeySelector.Purpose;

abstract class Bank3{
    public String name="Airtel Payment Bank";
    public String IFCname="airtelAirp";

    public void bank_details(){
        System.out.print(name+" "+IFCname);
    }
    abstract void deposite_money();
    abstract void withdrow_money();
    abstract void cheak_money();
}
class bank_services extends Bank3{
    private int blance=5000;
    private int pass;
    public int money;
    public void deposite_money(){
        System.out.println("Enter Password:=");
        Scanner pd=new Scanner(System.in);
        pass=pd.nextInt();
        if(pass==900){
            System.out.println("Enter Deposite Money:=");
            //Scanner m2=new Scanner(System.in);
            money=pd.nextInt();
            blance=blance+money;
            System.out.println("Your Deposite Blance ="+money);
            System.out.println("YOur Total Blance ="+blance);

        }
        else{
            System.out.print("Incorrect Password");
        }
    }

    public void withdrow_money(){
        System.out.println("Enter Your Password=");
        Scanner pd=new Scanner(System.in);
        pass=pd.nextInt();
        if(pass==900){
            System.out.println("Enter Withrow money=");
            //Scanner m1=new Scanner(System.in);
            money=pd.nextInt();
            blance=blance-money;
            System.out.println("YOur Withrow Amount ="+money);
            System.out.println("YOur Toral Blance ="+ blance);

        }
        else{
            System.out.print("Incorrct Passord");
        }
    }


    public void cheak_money(){
        System.out.println("Enter Password");
        Scanner pd=new Scanner(System.in);
        pass=pd.nextInt();
        if(pass==900){
            System.out.println("Your Blance ="+blance);
        }
        else{
            System.out.print("incorrect password");
        }
    }
}
class customer2{
    public static void main(String[] args) {
        bank_services ob2=new bank_services();

        int ch;
        //ob2.bank_details();
        System.out.println("1. Deposite_money");
        System.out.println("2. Withrow_money");
        System.out.println("3. Cheak_money");

        System.out.println("Enter Your choice :=");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch(ch){
            case 1:
            ob2.deposite_money();
            break;

            case 2:
            ob2.withdrow_money();
            break;
             
            case 3:
            ob2.cheak_money();
            break;
             
            default:
            System.out.print("invalid choice please re_enter.....");
            break;
        }
    }
}