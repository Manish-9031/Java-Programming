class poly {
    void show(){
        System.out.println("This is the super class method");
    }  
}
class sub_poly extends poly{
    void show(){
         super.show();
        System.out.println("this is the sub class method");
    }

}
class dem{
    public static void main(String[] args) {
        poly pl=new sub_poly();
        pl.show();
    }
}
