package pingwit.java.kl.hw20.task_1;

import java.sql.SQLException;

public class JdbcCompanyMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcCompany connector = new JdbcCompany();
        connector.runQuery();
    }
}
