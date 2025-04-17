package asm2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.*;

public class NhanVienRepository {
    Connection con;

    public NhanVienRepository() {
        con = DBConnect.getConnection();
    }
    
    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> listNVs = new ArrayList<>();
        String sql = """
                     SELECT [Ma]
                           ,[Ten]
                           ,[Sdt]
                           ,[TrangThai]
                       FROM [PTPM_FINALLY_JAVA_MOB1024].[dbo].[NhanVien]
                     """;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setTrangthai(rs.getInt(4));
                listNVs.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listNVs;
    }
    
    public Boolean updateNV(NhanVien nv) {
        String sql = """
                     UPDATE [dbo].[NhanVien]
                        SET [Ten] = ?
                           ,[Sdt] = ?
                           ,[TrangThai] = ?
                      WHERE [Ma] = ?
                     """;
        
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getTenNV());
            ps.setObject(2, nv.getSdt());
            ps.setObject(3, nv.getTrangthai());
            ps.setObject(4, nv.getMaNV());
            
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return check > 0;
    }

}
