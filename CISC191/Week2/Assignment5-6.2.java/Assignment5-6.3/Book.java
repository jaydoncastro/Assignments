public class Book {
   private String title;
   private String author;
   private String publisher;
   private String publicationDate;

   public void setTitle(String titleVal) {
      title = titleVal;
   }

   public void setAuthor(String authorVal) {
      author = authorVal;
   }

   public void setPublisher(String publisherVal) {
      publisher = publisherVal;
   }

   public void setPublicationDate(String dateVal) {
      publicationDate = dateVal;
   }

   public String getTitle() {
      return title;
   }

   public String getAuthor() {
      return author;
   }

   public String getPublisher() {
      return publisher;
   }

   public String getPublicationDate() {
      return publicationDate;
   }

   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
   }
}
