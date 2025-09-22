// PhotoInfoConverter.java
// Reads a text file containing photo file names and outputs modified names
// replacing "_photo.jpg" with "_info.txt"

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhotoInfoConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User inputs the file name (e.g., ParkPhotos.txt)
        String filename = sc.nextLine();

        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);

            // Read each line and replace "_photo.jpg" with "_info.txt"
            while (fileReader.hasNextLine()) {
                String photoName = fileReader.nextLine().trim();
                if (!photoName.isEmpty()) {
                    String infoName = photoName.replace("_photo.jpg", "_info.txt");
                    System.out.println(infoName);
                }
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + filename + " not found.");
        }
    }
}
