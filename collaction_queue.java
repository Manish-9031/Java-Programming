//linkedlist using queue interface
import java.util.LinkedList;
import java.util.Queue;
class line{
    public static void main(String[] args) {
        Queue<String>line_id=new LinkedList<>();
        line_id.offer("person1");
        line_id.offer("person2");
        line_id.offer("person3");
        System.out.println(line_id);
        System.err.println(line_id.poll());
        System.out.println(line_id);
        System.out.println(line_id.peek());

    }
}
