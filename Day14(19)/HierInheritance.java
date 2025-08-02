public class HierInheritance {
    public static void main(String[] args) {
       
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
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("Fly");
    }
}

