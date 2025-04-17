package lab56;

import java.util.ArrayList;
import java.sql.*;
import javax.xml.validation.Schema;
import lab56.DBConnect;

public class SachRepository {
    Connection con;
    public SachRepository() {
        con =DBConnect.getConnection();
    }
    
    public ArrayList<Sach> getAll(){
         ArrayList<Sach> listSach = new  ArrayList();
         String sql = """
                      SELECT
                              [MaSach]
                            ,[TenSach]
                            ,[TrangThai]
                            ,[GiaSach]
                        FROM [MOB1024_Lab56_Sach].[dbo].[Sach]
                      """;
         try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             Sach sch = new Sach();
             sch.setMaSach(rs.getString(1));
             sch.setTenSach(rs.getString(2));
             sch.setTrangThai(rs.getBoolean(3));
             sch.setGiaSach(rs.getFloat(4));
             
             listSach.add(sch);
             
         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         return listSach;
    }
    
    public boolean add(Sach sachNew){
        String sql = """
                      INSERT INTO [dbo].[Sach]
                                 ([MaSach]
                                 ,[TenSach]
                                 ,[TrangThai]
                                 ,[GiaSach])
                           VALUES
                                 (?, ?, ?, ?);
                      """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setObject(1, sachNew.getMaSach());
            ps.setObject(2, sachNew.getTenSach());
            ps.setObject(3, sachNew.isTrangThai());
            ps.setObject(4, sachNew.getGiaSach());
            
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check >0;
        }

    public boolean addSach(Sach sach) {
        String sql = """
                     INSERT INTO [dbo].[Sach]
                                ([MaSach]
                                ,[TenSach]
                                ,[TrangThai]
                                ,[GiaSach])
                          VALUES
                                (?, ?, ?, ?)
                     """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, sach.getMaSach());
            ps.setObject(2, sach.getTenSach());
            ps.setObject(3, sach.isTrangThai());
            ps.setObject(4, sach.getGiaSach());
            
            check = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return check > 0;
    }
    
    
}
