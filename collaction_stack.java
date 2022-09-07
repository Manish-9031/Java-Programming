
import java.util.Stack;

class animal{
    public static void main(String[] args) {
        Stack<String>animal_name=new Stack<>();
        animal_name.push("Dog");
        animal_name.push("Cow");
        animal_name.push("Cat");
        animal_name.push("Rat");
        System.out.println(animal_name);
        
        System.out.println(animal_name.peek());
        animal_name.pop();
        System.out.println(animal_name.peek());

    
    }
}