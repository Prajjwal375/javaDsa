public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prajval";
        Student.schoolName = "JMV";   // static variable accessed using class name

        Student s2 = new Student();
        System.out.println(s2.schoolName); // prints JMV
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
