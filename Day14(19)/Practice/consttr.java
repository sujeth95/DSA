public class consttr {
    public static void main(String[] args) {
        Student s1 = new Student("Sujeet");
        Student s2 = new Student();
        Student s3 = new Student(145);
        System.out.println(s1.name);
        System.out.println(s3.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Calling a Constructor..");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}