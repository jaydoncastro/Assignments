import java.sql.*;

public class DBManipulation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Miramar";
        String user = "root";
        String pass = "YOUR_PASSWORD"; // change to your MySQL password

        try {
            // Load driver (optional for new versions but still valid)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open connection
            Connection conn = DriverManager.getConnection(url, user, pass);

            // INSERT SQL Statement
            String insertQuery = "INSERT INTO Student " +
                    "(SSN, Fname, Mname, Lname, DOB, Street, Phone, Zipcode, deptID) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement psInsert = conn.prepareStatement(insertQuery);
            psInsert.setString(1, "111222333");
            psInsert.setString(2, "Philip");
            psInsert.setString(3, "David Charles");
            psInsert.setString(4, "Collins");
            psInsert.setString(5, "1951-01-30");  // yyyy-mm-dd format
            psInsert.setString(6, "NA");
            psInsert.setString(7, "NA");
            psInsert.setString(8, "NA");
            psInsert.setInt(9, 1234);

            psInsert.executeUpdate();
            System.out.println("Record inserted successfully.");

            // UPDATE SQL Statement — change zipcode to 92126
            String updateQuery = "UPDATE Student SET Zipcode = ? WHERE SSN = ?";
            PreparedStatement psUpdate = conn.prepareStatement(updateQuery);
            psUpdate.setString(1, "92126");
            psUpdate.setString(2, "111222333");

            psUpdate.executeUpdate();
            System.out.println("Zipcode updated successfully.");

            // Close connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
