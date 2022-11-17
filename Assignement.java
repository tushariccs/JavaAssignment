import java.util.Scanner;
public class Assignement {
    String StudentName;
    double AssignmentMark;
    double StudentMark;
    String Grade;

    Assignement(String StudentName , double AssignmentMark , double StudentMark,String Grade){
        this.StudentName=StudentName;
        this.AssignmentMark=AssignmentMark;
        this.StudentMark=StudentMark;
        this.Grade=Grade;
    }
    Assignement(){
        AssignmentMark=100;
    }
    double Accessor(){
        return  CalculateGrade();
    }
    private double getStudentMarK() {
        return StudentMark;
    }

    double Mutator(){
        Assignement a = new Assignement();
        a.getStudentMarK();
        if(StudentMark < AssignmentMark || StudentMark>0){
            return StudentMark;
        }else {
            System.out.println("Enter the Valid Marks");
        }
        return -1;
    }


    double CalculateGrade(){
        double Grade= (StudentMark/AssignmentMark)*100;
        if(Grade<50){
            System.out.printf("fail");
        } else if (Grade>=50 && Grade<=64) {
            System.out.printf("Pass");
        } else if (Grade>=65 && Grade<=74) {
            System.out.printf("credit");
        } else if (Grade>=75 && Grade<=84) {
            System.out.printf("distinction");
        }else {
            System.out.printf("high distinction");
        }
        return Grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("Enter the name of the Student");
        String name = sc.nextLine();
        System.out.println("Enter the Assignment Marks out off 30 ");
        int AssignmentMarks = sc.nextInt();
        System.out.println("Enter the Student marks given in Assignment");
        int StudentMark = sc.nextInt();
        Assignement a = new Assignement(name,AssignmentMarks,StudentMark,"A");
        a.Mutator();
        a.CalculateGrade();
        sc.close();
    }

}