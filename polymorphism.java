
                         //This is the compile time polymorphism example //
                         // run time polymorphism occure method overloding.
class poly_mor {
    void add(){
        int a=2; 
        int b=4;
        int c=a+b;
        System.out.println("sum of two number is = "+c);        
    }
    void add(int x,int y){                        //method overloding is the when method name is same and paramerer are deferent
        int d=x+y;
        System.out.println("sum of two number is ="+d);
    }
    void add(int m,double n){
        double p=m+n;
        System.out.println("sum of two numbers is="+p);
    }
    public static void main(String[] args) {
        poly_mor ob=new poly_mor();
        ob.add();
        ob.add(2, 4);
        ob.add(6, 7.8
        );
    }
}
