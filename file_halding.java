                        //this is Exception haldning in Java
class file_halding {
    public static void main(String[] args) {
        System.out.println("main method is starts");
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("Main method ended");
    }
}
