// Multiple Inheritance 
interface i1{
    void showw();

}
interface i2{
    void dispp();

}
class mani implements i1,i2{
    public void showw(){
        System.out.println("this is interface 1");
    }
    public void dispp(){
        System.out.println("this is interface is 2");
    }
    public static void main(String[] args) {
        mani obbMani=new mani();
        obbMani.showw();
        obbMani.dispp();
    }

}
