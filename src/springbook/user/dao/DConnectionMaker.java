package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
//        D사의 독자적 방법으로 Conenction을 생성하는 코드
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql:/springbook", "spring", "book");
        return c;
    }
}
