import java.util.Scanner;

public class BookInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input for base Book
      String title1 = scnr.nextLine();
      String author1 = scnr.nextLine();
      String publisher1 = scnr.nextLine();
      String pubDate1 = scnr.nextLine();

      // Input for Encyclopedia
      String title2 = scnr.nextLine();
      String author2 = scnr.nextLine();
      String publisher2 = scnr.nextLine();
      String pubDate2 = scnr.nextLine();
      String edition = scnr.nextLine();
      int pages = scnr.nextInt();

      // Create objects
      Book book1 = new Book();
      Encyclopedia encyclopedia1 = new Encyclopedia();

      // Set data for Book
      book1.setTitle(title1);
      book1.setAuthor(author1);
      book1.setPublisher(publisher1);
      book1.setPublicationDate(pubDate1);

      // Set data for Encyclopedia
      encyclopedia1.setTitle(title2);
      encyclopedia1.setAuthor(author2);
      encyclopedia1.setPublisher(publisher2);
      encyclopedia1.setPublicationDate(pubDate2);
      encyclopedia1.setEdition(edition);
      encyclopedia1.setNumPages(pages);

      // Output
      book1.printInfo();
      encyclopedia1.printInfo();

      scnr.close();
   }
}
