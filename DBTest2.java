import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DBTest2 {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:localhost:1521:orcl";
		Connection con = null;
		//Statement st = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"Scott","tiger");
			//st = con.createStatement();
			st = con.prepareStatement("select * from emp where sal > ?");
			st.setDouble(1,2000);
			rs = st.executeQuery();
			//rs = st.executeQuery("select * from emp");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			st = con.prepareStatement("select * from emp where ename like  ?");
			st.setString(1,"SCOTT");
			rs=st.executeQuery();
			if(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
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
