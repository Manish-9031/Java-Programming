 class D {
    int a,b;
    String c;
    D(){
        a=8;
        b=9;
        c="manish";
        System.out.println(a+" "+ b+ " "+ c);
    }
    D(D ref){
        a=ref.a;
        b=ref.b;
        c=ref.c;
        System.out.println(a+" "+ b+ " "+ c);
    }
    public static void main(String[] args) {
        D ob=new D();
        D ob1=new D(ob);
    }

    
}
