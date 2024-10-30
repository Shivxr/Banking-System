import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class Info extends Parent
{
    public int info(int uid) throws Exception{
        String query="SELECT * FROM accounts WHERE id==?;";
        Connection cn = DriverManager.getConnection(rurl);
        PreparedStatement stmt=cn.prepareStatement(query);
        stmt.setInt(1,uid);
        ResultSet rs=stmt.executeQuery();

            int id=rs.getInt(1);
            String s=rs.getString(2);
            int pin=rs.getInt(3);
            int cash=rs.getInt(4);
            System.out.println(""+id+" "+s+" "+pin+" "+cash);


        stmt.close();
        cn.close();
        return 0;
    }
}
