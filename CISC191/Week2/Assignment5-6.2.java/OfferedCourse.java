public class OfferedCourse extends Course {
   private String instructorName;
   private String location;
   private String classTime;

   public void setInstructorName(String name) {
      instructorName = name;
   }

   public void setLocation(String loc) {
      location = loc;
   }

   public void setClassTime(String time) {
      classTime = time;
   }

   public String getInstructorName() {
      return instructorName;
   }

   public String getLocation() {
      return location;
   }

   public String getClassTime() {
      return classTime;
   }

   @Override
   public void printInfo() {
      // Print base info first
      super.printInfo();
      // Then print offered course details
      System.out.println("   Instructor Name: " + instructorName);
      System.out.println("   Location: " + location);
      System.out.println("   Class Time: " + classTime);
   }
}
