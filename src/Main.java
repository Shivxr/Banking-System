import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Users ob1=new Users();
        Authenticate ob2=new Authenticate();
        Withdraw ob3=new Withdraw();
        Deposit ob4=new Deposit();
        Info ob5=new Info();
        while(true){
            System.out.println();
            System.out.println("To create a new Account 1");
            System.out.println("To Withdraw cash 2 ");
            System.out.println("To Deposit cash 3 ");
            System.out.println("To Check Statement of our Account 4");
            System.out.println("To exit 5 ");
            int inp=sc.nextInt();
            if(inp==1){
                ob1.add();
            }
            else if(inp==2){
                int f=ob2.auth();
                if(f>0){
                    ob3.withdraw(f);
                }
            }
            else if(inp==3){
                int f=ob2.auth();
                if(f>0){
                    ob4.deposit(f);
                }
            }
            else if(inp==4){
                int f=ob2.auth();
                if(f>0){
                    ob5.info(f);
                }
            }
            else{
                System.out.println("Thank you");
                break;
            }



        }
    }
}