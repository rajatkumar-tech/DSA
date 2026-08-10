public class advanceOops {

    // how to working inheritance 

    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();  // 


        Mammel mm = new Mammel();

        mm.legs = 4;
        System.out.println(mm.legs);
        
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
