abstract class amimal{
    void legs(){
        System.out.println("All amimals has four legs");
    }
    abstract void sound();
    abstract void eat();
}
class dog extends amimal{
    @Override
     public void sound(){
        System.out.println("bhoo.. bhoo...");
    }
    void eat(){
        System.out.println("Dogs eating Meat");
    }
}
class cows extends amimal{
    @Override
    void sound(){
        System.out.println("OOo..OO..OOO...");
    }
    void eat(){
        System.out.println("cows eating grass");
    }
}

class abstraction_exmp {
    public static void main(String[] args) {
        dog d=new dog();
        cows c=new cows();
        d.legs();
        d.sound();
        d.eat();
        c.legs();
        c.sound();
        c.eat();
        
    }
    
}
