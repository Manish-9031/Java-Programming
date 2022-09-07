
                                 /*Instant Block and Static Block */

class instantblock{
    int a=4;
    static int b=6;

    
    
    instantblock(){                                         // This is default constructor.
        System.out.println("Hello world");
    }
     
    {
        System.out.println("HIi everyone how are you"+a+ " "+b);    // Instant Block call by creating an object.

    }

    
    static{
        System.out.println( b); // This is statics Block call without any object. Statics block access only static variables.
    }
    
    public static void main(String[] args) {
        instantblock obje=new instantblock();
    }
}