import java.sql.Connection;

public class JDBC {

	
		// TODO Auto-generated method stub
		private static Connection conn=null;
		private static final String Driver = "oracle.jdbc.driver.OracleDriver";
		private static final String ConnectionString= "jdbc:oracle:thin:QA_Automation_Mobile/QA_Automation_Mobile145@10.105.36.139:1525:SEPQA01";
		private static final String user="user";
		private static final String pwd = "password";
		
		static 
		{
			try
			{
			Class.forName(Driver);
			}
			catch(ClassNotFoundException ex)
			{
				ex.printStackTrace();
			}
			
			
			
		}
		
		
		
		
		

	

}
