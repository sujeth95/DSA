public class MultiInheritance {
    public static void main(String[] args) {
       Dog dobby = new Dog();
       dobby.eats();
       dobby.legs = 4;
       System.out.println(dobby.legs);
    }
    
}

//Base Class
class Animal {
    String color;
    void eats() {
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

// //Derived Class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims in water");
//     }
// }

