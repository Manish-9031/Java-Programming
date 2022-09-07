import java.util.Scanner;

class Bank1 {
    private int blnc=1000;
    private int psd;
    int Amount;
      
    public void Deposide_money(){
        System.out.print("Enter Password:-");
        Scanner o=new Scanner(System.in);
        psd=o.nextInt();
        if(psd==111){
            System.out.println("Enter Depositer Amount:-");
            //Scanner s=new Scanner(System.in);
            Amount=o.nextInt();
            blnc=blnc+Amount;
            System.out.println("Deposite Amount :="+Amount);
            System.out.println("Total Blance :="+blnc);

        }
        else{
            System.out.print("Incorrect Password");
        }
    }
    public void Withdrow_money(){
        System.out.print("Enter password");
        Scanner o=new Scanner(System.in);
        psd=o.nextInt();
        if(psd==111){
            System.out.println("Enter Withrow money :=");
            //Scanner s=new Scanner(System.in);
            Amount=o.nextInt();
            blnc=blnc-Amount;
            System.out.println("Withrow amount ="+Amount);
            System.out.println("Total Blance = "+ blnc);
        }
        else{
            System.out.println("Incorrect Password");
        }
    } 
    public void Cheak_blance(){
        System.out.print("Enter Password ");
        Scanner o=new Scanner(System.in);
        psd=o.nextInt();
        if(psd==123){
            System.out.println(" Total balnace "+blnc);
        }
        else{
            System.out.println("Total amount ="+blnc);
        }
    }
}

class customer1{
    public static void main(String[] args) {
        Bank1 ob=new Bank1();
        int ch;
        System.out.println("1. Deposite money");
        System.out.println("2. Withdrow money");
        System.out.println("3. Cheak blance ");

       // System.out.println("enter your  choice ");
        System.out.println("Enter Your Choice ");
        Scanner o=new Scanner(System.in);
        ch=o.nextInt();
        switch(ch){
            case 1:
            ob.Deposide_money();
            break;
            case 2:
            ob.Withdrow_money();
            break;
            case 3:
            ob.Cheak_blance();
            default:
            System.out.print("Invalled choice");
            break;
        }
    }
}