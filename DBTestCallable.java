import java.sql.*;

public class DBTestCallable {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:localhost:1521:orcl";
		Connection con = null;
		//Statement st = null;
		CallableStatement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"Scott","tiger");
			//st = con.createStatement();
			st = con.prepareCall("call insertMaster(?,?,?) ");
			st.setInt(1,105);  st.setString(2, "VijAY"); st.setDouble(3, 12300.00);
			st.executeUpdate();
			//rs = st.executeQuery("select * from emp");
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally
		{
			try {

				if(st != null) st.close();
				if(con != null) con.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
