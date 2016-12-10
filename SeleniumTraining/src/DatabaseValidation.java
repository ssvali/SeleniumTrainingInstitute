import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseValidation {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		   Connection connection;
		   Statement statement;
		   ResultSet rs;

		String databaseURL = "jdbc:mysql://localhost:3306/easy";
        String user = "root";
        String password = "root";
        connection = null;
        
           /*
             Step 1 - Register the driver
             The forName() method of Class class is used to register the driver class. 
             This method is used to dynamically load the driver class.
             Syntax - forName(String classname)
             Register OracleDriver class - Class.forName("oracle.jdbc.driver.OracleDriver");  
             Register mySqlDriver class -  Class.forName("com.mysql.jdbc.Driver");
             
           */
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database...");
            
            /*
            Step 2 - Create the Connection Object
            The getConnection() method of DriverManager class is used to establish connection with the database.
            The DriverManager class acts as an interface between user and drivers.
            
            Connection interface - A Connection is the session between java application and database. 
            */
            connection = DriverManager.getConnection(databaseURL, user, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
            
            /*
            Step 3 - Create Statement Object
			The createStatement() method of Connection interface is used to create statement. 
			The object of statement is responsible to execute queries with the database.
			
			Statement interface
			The Statement interface provides methods to execute queries with the database.
            */
            String query = "select * from employee";
            statement = connection.createStatement();
            
            /*
            Step 4 - Execute the Query
            The executeQuery() method of Statement interface is used to execute queries to the database. 
            This method returns the object of ResultSet that can be used to get all the records of a table.
            
            ResultSet interface
			The object of ResultSet maintains a cursor pointing to a row of a table
            */
            rs = statement.executeQuery(query);
            
            
            while(rs.next()){
                int EmpId= rs.getInt("EmpId");
                String EmpName= rs.getString("EmpName");
                String EmpAddress=rs.getString(3);
                String EmpDept=rs.getString("EmpDept");
                Double EmpSal= rs.getDouble(5);
                System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
            }
            
            /*
            Step 5 - Close Connection
            By closing connection object statement and ResultSet will be closed automatically. 
            The close() method of Connection interface is used to close the connection.
            */
            connection.close();
        
	}

}
