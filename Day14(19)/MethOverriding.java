public class MethOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
    
}
// This is a run time polymorphism.
class Animal {
    void eat(){
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}