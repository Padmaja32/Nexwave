import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class DBTestMtDt {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:localhost:1521:orcl";
		Connection con = null;
		//Statement st = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"Scott","tiger");
			//st = con.createStatement(); for Statement
			st = con.prepareStatement("select * from dept");
			rs = st.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			//rs = st.executeQuery("select * from emp");
			for (int i = 1; i <= count; i++) 
				System.out.print(rsmd.getColumnName(i)+"     ");
			System.out.println();
			
			while(rs.next()) {
				for (int i = 1; i <=count; i++) 
					System.out.print(rs.getString(i)+"     ");
				System.out.println();	
			}
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null) rs.close();
				if(st != null) rs.close();
				if(con != null) rs.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
