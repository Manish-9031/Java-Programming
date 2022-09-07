class superkey{
    int a=6;
}
class subclass extends superkey{
   int a=4;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        subclass sub=new subclass();
        sub.show();
    }
}