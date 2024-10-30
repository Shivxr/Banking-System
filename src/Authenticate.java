import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Authenticate extends Parent{
    int cpin;
    public int auth() throws Exception{
        String query="SELECT pin FROM accounts where id==?;";
        Connection cn = DriverManager.getConnection(rurl);
        PreparedStatement stmt=cn.prepareStatement(query);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your user id");
        int id=sc.nextInt();
        stmt.setInt(1,id);
        ResultSet rs=stmt.executeQuery();
        while(rs.next()){
            cpin=rs.getInt(1);
        }
        System.out.println("Enter your pin");
        int pin=sc.nextInt();
        stmt.close();
        cn.close();
        if(cpin==pin){
            System.out.println("Authorization success");
            return id;
        }
        else{
            System.out.println("Authorization revoked");
            return 0;
        }
    }
}

