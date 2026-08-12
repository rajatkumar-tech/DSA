// public class advanceOops {

//     // how to working inheritance 

//     public static void main(String args[]){
//         Dog dobby = new Dog();
//         dobby.eat();  // only work the derived class
//         dobby.breed = "white";
//         System.out.println(dobby.breed);

//         Mammel mm = new Mammel();
//         mm.legs = 4;
//         System.out.println(mm.legs);

//         Animal an = new Animal();
//         an.color = "gray";
//         an.eat();
//         an.breath();
//         d

//     }

// }

// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breath (){
//         System.out.println("breath");
//     }
// }

// class Mammel extends Animal {
//     int legs;
// }

// class Dog extends Animal{
//     String breed;
// }

public class advanceOops {
    public static void main(String args[]) {

        fish a = new fish();

        a.swim();  //fish class ka apna method
        a.eat();  // Animal class
        a.breath();  // Animal class

        Birds bd = new Birds();
        bd.fly();
        bd.breath();
        bd.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eating");
    }

    void breath() {
        System.out.println("breathing");
    }

}

class Mammel extends Animal {
    void legs() {
        System.out.println("Walking on legs");
    }
}

class Birds extends Mammel {
    void fly() {
        System.out.println("flying on sky ");
    }
}

class fish extends Birds {
    void swim() {
        System.out.println("swimming");
    }
}
