package projects.dao;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DbConnection {

    private static String HOST = "localhost";
    private static String PASSWORD = "projects";
    private static int PORT = 3306;
    private static String SCHEMA = "projects";
    private static String USER = "projects";

    public static DataSource getDataSource() {
        MysqlDataSource db = new MysqlDataSource();
        String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",
                HOST, PORT, SCHEMA, USER, PASSWORD);

        db.setUrl(uri);
        return db;
    }
}
