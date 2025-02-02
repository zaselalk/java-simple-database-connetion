package org.example;

import java.sql.*;

public class Student {
    Connection conn;
    public Student(Connection conn){
        this.conn = conn;
    }
    public void getStudents() throws SQLException {
        String query = "Select * from basicdata INNER JOIN marks WHERE basicdata.stu_id=marks.stu_id";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getString(1)
                    + "|"+ rs.getString(2)+ "|"
                    + rs.getString(3) + "|"
                    + rs.getString(5)+ "|"
                    + rs.getString(6)+ "|"
                    + rs.getString(7));
        }
    }
    public void insertStudent(String tgNumber,String name, String address) throws SQLException{
        String query = "Insert into basicdata values(?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, tgNumber);
        stmt.setString(2, name);
        stmt.setString(3, address);

        stmt.executeUpdate();
    }
    public void deleteStudent(String tgNumber) throws SQLException{
        String query = "Delete from basicdata WHERE basicdata.stu_id=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, tgNumber);
        stmt.executeUpdate();

    }
    public void updateStudent(String tgNumber, String name, String address) throws SQLException{
        String query = "Update basicdata set stu_name=?,address=? where basicdata.stu_id=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, address);
        stmt.setString(3, tgNumber);
        stmt.executeUpdate();
    }


}
