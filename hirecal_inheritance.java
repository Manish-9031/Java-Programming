                      //Hierrarchil Inheritance//
class super_a1 {
    int a=5;
    int b=7;
}
class sub_a1 extends super_a1{

    void add(){
        int c=a+b;
        System.out.println("addition of two number is="+c);
    }
}
class sub_a2 extends super_a1{
    void subs(){
        int d=a-b;
        System.out.println("substraction of two numbers is="+d);
    }
}
class exmp{
    public static void main(String[] args) {
        sub_a1 o1=new sub_a1();
        sub_a2 o2=new sub_a2();
        o1.add();
        o2.subs();
    }
}
