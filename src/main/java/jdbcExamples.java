import java.sql.*;
import java.util.Collection;

public class jdbcExamples {
    public static void main(String[] args) {
        String dbUrl="jdbc:mysql://localhost:3306/demo";
        String username="root";
        String password="password";
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            System.out.println(" conect to detabase secessfuly");
            Statement statement=conn.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM employees");
            statement.execute(" insert into employees VALUES(NULL,'JACK'44)");
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                int age=resultSet.getInt("age");
                System.out.println("ID:"+id+" Name:"+name+"Age:"+age);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            // Execute the sql statements

        }
    }
}
