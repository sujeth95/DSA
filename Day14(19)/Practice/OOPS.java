public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("orange");
        p1.setTip(19);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.percentageCal(90, 95, 100);
        System.out.println(s1.percentage);
}
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int roll;
    float percentage;

    void percentageCal(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3;
    }
}
