public class Course {
   private String courseNumber;
   private String courseTitle;

   public void setCourseNumber(String num) {
      courseNumber = num;
   }

   public void setCourseTitle(String title) {
      courseTitle = title;
   }

   public String getCourseNumber() {
      return courseNumber;
   }

   public String getCourseTitle() {
      return courseTitle;
   }

   public void printInfo() {
      System.out.println("Course Information:");
      System.out.println("   Course Number: " + courseNumber);
      System.out.println("   Course Title: " + courseTitle);
   }
}
