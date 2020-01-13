import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class DBTestDML {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:localhost:1521:orcl";
		Connection con = null;
		//Statement st = null;
		PreparedStatement st = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"Scott","tiger");
			//st = con.createStatement();
			con.setAutoCommit(false);
			st = con.prepareStatement("insert into employee values(?,?,?,?)");
			st.setInt(1,100);  st.setString(2, "AJAY"); st.setDouble(3, 1000.00);
			st.setDate(4, new Date(1990,11,13));
			int count = st.executeUpdate();
			System.out.println(count+" rows Intserted");
			con.rollback();
			
			st.setInt(1,101);  st.setString(2, "VIJAY"); st.setDouble(3, 1500.00);
			st.setDate(4, new Date(1994,11,23));
			count = st.executeUpdate();
			System.out.println(count+" rows Intserted");
			
			
			st = con.prepareStatement("update employee set salary=? where eid=?");
			st.setDouble(1,2000.00); st.setInt(2, 101);
			count = st.executeUpdate();
			System.out.println(count+" rows Updated");
			con.commit();
		}
			//rs = st.executeQuery("select * from emp"));
			
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(st != null) st.close();
				if(con != null) st.close();
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
