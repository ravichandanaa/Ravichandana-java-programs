class Institute {
    String name;
    Institute(String name) {
        this.name = name;
        System.out.println("Institute name: " + name);
    }
}

class School extends Institute {
    String student_name = "Raji";
    int roll_no = 98;
    int marks = 90;
    School(String instituteName) {
        super(instituteName);
    }

    void display() {
        System.out.println("Student Name: " + student_name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
    }
}
public class  schoolManagement {
    public static void main(String[] args) {
        School s = new School("Annamacharya");
        s.display();
    }
}

