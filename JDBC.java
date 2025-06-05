public class JDBCTest{
	public static void main(String[] args){
		try{
			//Load the JDBC driver
			Class.forName("SQL path");
			//2. Connect to the database
			Connection con=DriverManager.getConnection("SQL ");
			//3. Insert multiple students
			String insertSQL="REPLACE INTO students VALUES(?,?)";
			PreparedStatement pstmt=con.prepareStatement(insertSQL);
			//Inserting 6 students(1 existing+5 new)
			Object[][]students={
				{1,"Alice"},
				{2,"Bob"},
				{3,"Sreedhar"},
				{4,"Nithya"},
				{5,"Nithin"},
				{6,"Sai"}
			}
			for(Object[] student:students){
				pstmt.setInt(1,(int)student[0]);
				pstmt.setString(2,(String) student[1]);
				pstmt.executeUpdate();
			}
			//4.Read and display data
			Statement stmt=con.CreateStatement();
			ResultSet rs=stmt.con.CreateStatement();
			System.out.println("Student List:");
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
			//5. Connection
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

						