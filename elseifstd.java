import java.util.Scanner;

class e {
    public static void main(String[] args) {
        System.out.print("Enter Your Marks :=");
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();
        if(marks>=60 && marks<=100){
            System.out.print("You are Frist Division ");

        }
        else if(marks>=40 && marks<=59){
            System.out.print("you are second divionon");

        }
        else if(marks>=30 && marks<=39){
            System.out.println("You are Third divisiion ");

        }
        else{
            System.out.print("You are FAIL");
        }
        
    }

}