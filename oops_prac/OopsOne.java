package oops_prac;

public class OopsOne {
     public static void main(String[] args) {
        // store 5 roll nos
        // int[] numbers = new int[5];

        // store 5 names
        // String[] names = new String[5];

        // data of 5 students: {rollno, name, marks}
        // int[] rollnos = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // Student[] students = new Student[5];
        // System.out.println(Arrays.toString(students));

        // Student student1;
        // student1 = new Student();
        // Student student1 = new Student();
        // student1.rollno = 21;
        // student1.name = "Harshit Satya";
        // student1.marks = 100.0f;
        // System.out.println(student1.rollno);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);
        
        Student student1 = new Student(21, "Harshit Satya", 100);
        // System.out.println(student1.rollno);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);
        // student1.getThis();
        // Student student2 = new Student(22, "Shanki Satya", 100);
        // student2.getThis();

        // Student student2 = new Student();
        // System.out.println(student2.rollno);
        // System.out.println(student2.name);
        // System.out.println(student2.marks);

        // student1.greetStudent();
        // student2.greetStudent();

        // Student random = new Student(student1);
        // System.out.println(random.rollno);
        // System.out.println(random.name);
        // System.out.println(random.marks);

        // Student random2 = new Student();
        // System.out.println(random2.rollno);
        // System.out.println(random2.name);
        // System.out.println(random2.marks);

        Student x = new Student(8, "Shanki", 100.0f);
        Student y = x;

        System.out.println("Y " + y.name);
        System.out.println("X " + x.name);

        y.name = "Harshit";
        System.out.println("Y " + y.name);
        System.out.println("X " + x.name);
    }

}

 // create a class
class Student {
    int rollno;
    String name;
    float marks;

    // public void getThis() {
    //     System.out.println(this);
    // }

    Student(Student other) {
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a contructor from another constructor
        // internally: new Student(0, "Default Person", 100);
        this(0, "Default Person", 100);
    }

    Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public void greetStudent() {
        System.out.println("Hello, " + this.name);
    }
}