//import org.junit.Test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//import static org.junit.Assert.assertTrue;
//
//public class DbTest {
//    private String name;
//    private String url;
//    private String password;
//
//    public DbTest() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Test
//    public void testDriverManager() throws SQLException {
//
//        DbTest conClient = new DbTest();
//        conClient.setName("root");
//        conClient.setUrl("jdbc:mysql://localhost/adressbuch");
//        conClient.setPassword("");
//        Connection conn = DriverManager.getConnection(conClient.getUrl(), conClient.getName(), conClient.getPassword());
//        assertTrue(conn != null);
//    }//test deneme
//}
