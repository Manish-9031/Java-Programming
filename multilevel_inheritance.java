class super_clss {
    int a=8;
    int b=5;
}
class sub_clss1 extends super_clss{
    int c=a+b;
    void add(){
        System.out.println("Add two number is="+c);
    }
}
class sub_clss2 extends sub_clss1 {
    int d=a-b;
    void sub(){
        System.out.println("substraction of two number ="+d);
    }
}
class demo{
    public static void main(String[] args) {
        sub_clss2 obb=new sub_clss2();
        obb.add();
        obb.sub();
    }
}