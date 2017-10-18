import java.sql.*;

/**
 * Created by PuFan on 2017/2/21.
 */
public class JDBC {
    public static void main(String[] args) {
        Connection con = null;
        Statement sta = null;
        ResultSet res = null;
        String sql = null;
        String url = new String("jdbc:mysql://localhost:3306/corejava?characterEncoding=utf8&useSSL=false");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "DataGrip", "");
            sta = con.createStatement();
            sql = new String("select * from booklist");
            res = sta.executeQuery(sql);
            System.out.println("Title       Price       Author");
            while (res.next()) {
                System.out.print(res.getString("Title"));
                System.out.print("     ");
                System.out.print(res.getString("Price"));
                System.out.print("      ");
                System.out.print(res.getString("Author") + "\n");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (SQLException a) {
            System.out.println("SQLException");
        } catch (Exception b) {
        } finally {
            try {
                if (con != null)
                    con.close();
                if (sta != null)
                    sta.close();
                if (res != null)
                    res.close();
            } catch (Exception e) {
            }
        }
    }
}
