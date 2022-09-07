// Arraylist using list interface
import java.util.ArrayList;
import java.util.List;

// Java Colllaction program start now//


class collaction_arraylist {
    public static void main(String[] args) {
        /* String id[]=new String[5];
        id[0]="Manish";
        id[1]="Anish";
        id[2]="Akash";     // This is the simple way to create array
        id[3]="Ramesh";
        for(String i : id)
        System.out.println(i);
        */

        // Java Collaction array class

        List<String> name =new ArrayList<>();
        name.add("manish");
        name.add("Anish");
        name.add("Akash");
        name.add("Krishna");
         
        System.out.println(name);
        name.add("shivam");
        name.add("prince");
        System.out.println(name);

        name.add(2, "Rakesh");
        System.out.println(name);

        // Add prist arraylist to second arraylish
        ArrayList<String> name1 =new ArrayList<>();
        name1.add("Manish2");
        name1.add("Anish2");
        name.addAll(name1);
        System.out.println(name);

        // get the element an array
        System.out.println(name.get(2));
        System.out.println(name.get(7));

        // Remove element from the arraylish
        name.remove(7);
        System.out.println(name);
        name.remove(String.valueOf("manish"));
        System.out.println(name);

        // how to update arraylist element
        name.set(1, "Archna");
        System.out.println(name);

        // contain menthod
    
        System.out.println(name.contains("manish"));
        
        // Iterate element from the arraylish
        for(String i : name){
            System.out.println("The following Name= "+i);
        }


       // Delete all element from the arraylist
       name.clear();
       System.out.println(name);

    }
    
}
