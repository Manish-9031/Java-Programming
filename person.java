class person {
    int age=20,weight=50,id=13;
    void eat(){
        System.out.print("I am eating food ");
    }
    void sleep(){
        System.out.print("I am sleepin 8 hours");

    }
    public static void main(String[] args) {
        person p=new person();
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.id);

        p.eat();
        p.sleep();

    }
}
