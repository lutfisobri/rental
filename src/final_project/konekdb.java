
package final_project;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konekdb {
    private static Connection koneksi;
    
    public static Connection GetConnection() throws SQLException {
        if (koneksi==null){
            new Driver();
            System.out.println("Terhubung");
        
//        koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobil","root","");
        koneksi=DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6452648","sql6452648","B1fMNnfMCj");
//        koneksi=DriverManager.getConnection("jdbc:mysql://sql306.epizy.com/epiz_29641212_rental_mobil","epiz_29641212","ozlLatFYNvQ");
        }
        return koneksi;
    }
}
