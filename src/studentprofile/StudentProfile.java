package studentprofile;

/************************************************************************
 * Author: NURAISYAH HAMIRAH BINTI ZUKEPLI
 * Program Name: StudentProfile.java
 * Description: Displays student profile information
 * Date: 22 October 2026
 * Version: 1.0
 ************************************************************************/

public class StudentProfile{ // main class declaration

    public static void main(String[] args) { // main method

        // display student details to the console
        System.out.println("Name: NURAISYAH HAMIRAH BINTI ZUKEPLI");
        System.out.println("Student ID: S84796");
        System.out.println("Programme: Bachelor of Computer Science");
        System.out.println("Semester: Semester 1");
        System.out.println("Favourite Language: Java");
        
        
        GradeMessage grade = new GradeMessage();
        grade.displayGrade();
    }
}

   