
                                      // Default constructure
class M{
    int a,b;
    String c;
    M(){
        a=40;
        b=5;
        c="manish";
        System.out.println("I am manish kumar");
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
class N{
    public static void main(String[] args) {
    M r=new M();
    r.display();
    }
}