
                            // Single Inheritance
class super_cls {
    int a;
    String b="manish kumar";
    void disp(){
        System.out.println("Hii every one I am manish kumar");
    }
}
class sub_cls extends super_cls{
    void show(){
        System.out.println(b);
    }
}
class h{
    public static void main(String[] args) {
    sub_cls ob=new sub_cls();
    ob.show();
    ob.disp();
    } 
}
