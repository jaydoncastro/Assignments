public class Encyclopedia extends Book {
   private String edition;
   private int numPages;

   public void setEdition(String editionVal) {
      edition = editionVal;
   }

   public void setNumPages(int pagesVal) {
      numPages = pagesVal;
   }

   public String getEdition() {
      return edition;
   }

   public int getNumPages() {
      return numPages;
   }

   @Override
   public void printInfo() {
      // Call the base class method first
      super.printInfo();
      // Add derived class information
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Pages: " + numPages);
   }
}
