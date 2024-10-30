import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Deposit extends Parent{
    int balance;
    public int deposit(int uid) throws Exception{
        Scanner sc=new Scanner(System.in);
        String query="SELECT cash FROM accounts where id==?;";
        String update="UPDATE accounts SET cash=? WHERE id==?;";

        Connection cn = DriverManager.getConnection(rurl);

        PreparedStatement stmt=cn.prepareStatement(query);
        PreparedStatement st=cn.prepareStatement(update);

        stmt.setInt(1,uid);

        st.setInt(2,uid);

        ResultSet rs=stmt.executeQuery();

        balance=rs.getInt("cash");

        System.out.println("Your current balance is : "+balance);

        System.out.println("Enter amount to deposit");
        int amt=sc.nextInt();
        amt+=balance;

        st.setInt(1,amt);

        st.executeUpdate();

        System.out.println("current balance after deposit is : "+amt);
        stmt.close();
        st.close();
        cn.close();

        return 0;
    }
}
