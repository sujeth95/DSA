public class MethOverloading {
    public static void main(String[] args) {
        Calculator cat = new Calculator();
        System.out.println(cat.sum(1,2));
        System.out.println(cat.sum((float)1.2,(float)2.5));
        System.out.println(cat.sum(1,2,5));
    }
    
}
// This is a compile time polymorphism.
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