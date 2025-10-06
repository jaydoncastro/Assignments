import java.util.Scanner;

public class CourseInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input
      String courseNum = scnr.nextLine();
      String courseTitle = scnr.nextLine();
      String offeredNum = scnr.nextLine();
      String offeredTitle = scnr.nextLine();
      String instructor = scnr.nextLine();
      String location = scnr.nextLine();
      String time = scnr.nextLine();

      // Base course
      Course course1 = new Course();
      course1.setCourseNumber(courseNum);
      course1.setCourseTitle(courseTitle);
      course1.printInfo();

      // Offered course
      OfferedCourse course2 = new OfferedCourse();
      course2.setCourseNumber(offeredNum);
      course2.setCourseTitle(offeredTitle);
      course2.setInstructorName(instructor);
      course2.setLocation(location);
      course2.setClassTime(time);
      course2.printInfo();

      scnr.close();
   }
}
