public class advanceOops {

    // how to working inheritance 

    public static void main(String args[]){
        
    }
    
}


class Animal{
    String color;

    void eat(){
        System.out.println("eat");
    }

    void breath (){
        System.out.println("breath");
    }
}

class Mammel extends Animal {
    int legs;
}

class Dog extends Animal{
    String breed;
}
