import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Users extends Parent {
    public int add() throws Exception{
        Scanner sc=new Scanner(System.in);
        String query="INSERT INTO accounts(name,pin,cash) VALUES(?,?,?);";
        String q2="SELECT * FROM accounts ORDER BY id DESC LIMIT 1;";
        Connection cn = DriverManager.getConnection(rurl);
        Statement st=cn.createStatement();
        PreparedStatement stmt=cn.prepareStatement(query);
        System.out.println("Enter Your Name");
        String v1=sc.nextLine();
        System.out.println("Choose your pin");
        int v2=sc.nextInt();
        System.out.println("Enter your Initial Deposit");
        int v3=sc.nextInt();
        stmt.setString(1,v1);
        stmt.setInt(2,v2);
        stmt.setInt(3,v3);
        stmt.executeUpdate();
        ResultSet rs=st.executeQuery(q2);
        while(rs.next()){
            int id=rs.getInt(1);
            String s=rs.getString(2);
            int pin=rs.getInt(3);
            int cash=rs.getInt(4);
            System.out.println("User "+s+" created account with id "+id+" and pin "+pin+" with balance "+cash);
        }
        st.close();
        stmt.close();
        cn.close();
        return 0;
    }
}
