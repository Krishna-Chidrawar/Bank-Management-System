
package Bank_Management_System;
import java.util.*;
import java.sql.*;

/* Connection need 5 basic steps : 
1) Register the Driver
2) Create Connection
3) Create Statement
4) Execute Query
5) Close Connection
*/
public class Conn 
{
    Connection  c;
    Statement s;
    
    public Conn()
    {
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c= DriverManager.getConnection("jdbc:mysql///bankmanagementsystem","root","Krish@9860");
            s= c.createStatement();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
}
