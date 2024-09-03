import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private int[] marks = new int[5];

    
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}

class StudentRecord extends Student {
    
    public void recordFetch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        setRollNo(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Name: ");
        setName(scanner.nextLine());

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            getMarks()[i] = scanner.nextInt();
        }
    }

    
    public void displayRecord() {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Name: " + getName());
        System.out.print("Marks: ");
        for (int mark : getMarks()) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    
    public void per_gerd() {
        int totalMarks = 0;
        for (int mark : getMarks()) {
            totalMarks += mark;
        }
        double percentage = (totalMarks / 500.0) * 100;

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class inheritances_teacher_student{
    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord();
        sr.recordFetch(); 
        sr.displayRecord(); 
        sr.per_gerd(); 
    }
}