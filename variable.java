class variable {
    int a=3; // instant variables
    static int b=5; // Statics variables
    public static void main(String[] args) {
        int d=6; // LOcal variable
        variable c=new variable();
        System.out.println(c.a);
        System.out.println(b);
        System.out.println(d);
    }
}
