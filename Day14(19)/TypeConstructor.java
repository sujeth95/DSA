public class TypeConstructor {
    public static void main(String[] args) {
    // Student s1 = new Student("Sujeet");  
    // System.out.println(s1.name);  

    Student s1 = new Student();
    Student s2 = new Student("Sujeet");
    Student s3 = new Student(1234);
    // Student s4 = new Student("aman", 567);
    
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}