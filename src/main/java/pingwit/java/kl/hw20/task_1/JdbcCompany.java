package pingwit.java.kl.hw20.task_1;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcCompany {
    private static final String URL ="jdbc:postgresql://localhost:5432/first_dat";
    private static final String USER ="postgres";
    private static final String PASSWORD = "docker";

        public void runQuery() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
           Statement statement = connection.createStatement();
           ResultSet rs = statement.executeQuery("SELECT * FROM actions");

           List <Company> companies = new ArrayList<>();

           while (rs.next()){
               Company company = new Company(rs.getLong(1),rs.getString(2),
                   rs.getString(3),rs.getLong(4),
                   rs.getNString(5),rs.getLong(6) );
               companies.add(company);
           }
            System.out.println(companies);
        }


    }

}
