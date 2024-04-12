import java.util.ArrayList;
public class StudentAwards {
   public Student theMostGPA(ArrayList<Student> students){
       BestStudent bestStudent = (ArrayList<Student> students1) -> {
           double mostGPA = Integer.MIN_VALUE;
           Student st = null;
           for (Student stu : students1) {
               if (stu.getGpa() > mostGPA) {
                   mostGPA = stu.getGpa();
                   st = stu;
               }
           }
           return st;
       };
        return bestStudent.theBest(students);
    }
   public Student theMostAge(ArrayList<Student> students){
       BestStudent bestStudent = (ArrayList<Student> students1) -> {
           Integer mostGPA = Integer.MIN_VALUE;
           Student st = null;
           for (Student stu : students1) {
               if (stu.getAge() > mostGPA) {
                   mostGPA = stu.getAge();
                   st = stu;
               }
           }
           return st;
       };
       return bestStudent.theBest(students);
   }
   public Student theLongestFullName(ArrayList<Student> students){
       BestStudent bestStudent = (ArrayList<Student> students1) -> {
           Integer mostGPA = 0;
           Student st = null;
           for (Student stu : students1) {
               if (stu.getFullName().length() > mostGPA) {
                   mostGPA = stu.getFullName().length();
                   st = stu;
               }
           }
           return st;
       };
       return bestStudent.theBest(students);
   }

   public Student theHighest(ArrayList<Student> students){
       BestStudent bestStudent = (ArrayList<Student> students1) -> {
           Integer mostGPA = 0;
           Student st = null;
           for (Student stu : students1) {
               if (stu.getHeight() > mostGPA) {
                   mostGPA = stu.getHeight();
                   st = stu;
               }
           }
           return st;
       };
       return bestStudent.theBest(students);
   }

}
