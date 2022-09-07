 class F {
    int a;
    int b;
    F(int x ,int y){
        a=x;
        b=y;
        System.out.println(a+" "+b);

    }
    F(F r){
        a=r.a;
        b=r.b;
        System.out.println(a+" "+b);

    }
    public static void main(String[] args) {
        F ob=new F(4,6);
        F ob1=new F(ob);
    }
}
