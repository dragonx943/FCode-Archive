package buoi13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SanPhamRepository {
    Connection con;

    public SanPhamRepository() {
        con = DBConnect.getConnection();
    }
    
    public ArrayList<SanPham> sort() {
        ArrayList<SanPham> listSP = new ArrayList();
         String sql = """
                      SELECT [Ma]
                            ,[Ten]
                            ,[NgaySX]
                            ,[Website]
                            ,[SoLuong]
                            ,[TrangThai]
                        FROM [FINALASS_FPOLY_NET_JAVA_SM22_BL2].[dbo].[SanPham]
                        ORDER BY SoLuong ASC
                      """;
         try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             SanPham sch = new SanPham();
             sch.setMaSP(rs.getString(1));
             sch.setTenSP(rs.getString(2));
             sch.setNgaySX(rs.getDate(3));
             sch.setWebsite(rs.getString(4));
             sch.setSoLuong(rs.getInt(5));
             sch.setTrangThai(rs.getInt(6));
             listSP.add(sch);
             
         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         return listSP;
    }
    
    public ArrayList<SanPham> getAll(){
         ArrayList<SanPham> listSP = new ArrayList();
         String sql = """
                      SELECT [Ma]
                            ,[Ten]
                            ,[NgaySX]
                            ,[Website]
                            ,[SoLuong]
                            ,[TrangThai]
                        FROM [FINALASS_FPOLY_NET_JAVA_SM22_BL2].[dbo].[SanPham]
                      """;
         try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             SanPham sch = new SanPham();
             sch.setMaSP(rs.getString(1));
             sch.setTenSP(rs.getString(2));
             sch.setNgaySX(rs.getDate(3));
             sch.setWebsite(rs.getString(4));
             sch.setSoLuong(rs.getInt(5));
             sch.setTrangThai(rs.getInt(6));
             listSP.add(sch);
             
         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         return listSP;
    }
    
    public ArrayList<SanPham> searchFT(String ten) {
        ArrayList<SanPham> lstSPs = new ArrayList<>();
        // lấy dữ liệu từ sql
        // gõ """
        String sql = """
                     SELECT [Ma]
                            ,[Ten]
                            ,[NgaySX]
                            ,[Website]
                            ,[SoLuong]
                            ,[TrangThai]
                            FROM [FINALASS_FPOLY_NET_JAVA_SM22_BL2].[dbo].[SanPham]
                     WHERE Ten LIKE ?
                     """;
        // try-catch: xử lý ngoại lệ => try + ctrl + space
        // try: chứa code có thể xảy ra lỗi
        // catch: bắt lỗi xảy ra trong try
        // import java.sql.Connection
        try {
            // import java.sql.PreparedStatement
            // tạo đối tượng ps thực thi câu lệnh sql
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ten);
            // ResultSet: nhận kết quả trả về dưới dạng bảng
            // executeQuery(): thực hiện câu truy vấn
            ResultSet rs = ps.executeQuery();
            // rs.next(): kiểm tra xem còn dòng dữ liệu không
            while (rs.next()) {
                // 1. Tạo đối tượng GV mới
                SanPham sch = new SanPham();
                // 2. Lấy dữ liệu từ bảng gán vào đối tượng
                sch.setMaSP(rs.getString(1));
                sch.setTenSP(rs.getString(2));
                sch.setNgaySX(rs.getDate(3));
                sch.setWebsite(rs.getString(4));
                sch.setSoLuong(rs.getInt(5));
                sch.setTrangThai(rs.getInt(6));
                // 3. Thêm đối tượng gv vào danh sách
                lstSPs.add(sch);
            }
        } catch (Exception e) {
            e.printStackTrace(); // in thông tin về lỗi
        }
        return lstSPs;
    }
    
    public boolean addSP(SanPham sp) {
        String sql = """
                     INSERT INTO [dbo].[SanPham]
                             ([Ma], [Ten], [NgaySX], [Website], [SoLuong], [TrangThai])
                     VALUES (?, ?, ?, ?, ?, ?)
                     """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, sp.getMaSP());
            ps.setObject(2, sp.getTenSP());
            ps.setObject(3, sp.getNgaySX());
            ps.setObject(4, sp.getWebsite());
            ps.setObject(5, sp.getSoLuong());
            ps.setObject(6, sp.getTrangThai());
            
            check = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return check > 0;
        // check = 1 -> 1 > 0 return true
        // else: false
    }
    
    public boolean updatesp(SanPham spNew){
        String sql = """
                     UPDATE [dbo].[SanPham]
                        SET [Ten] = ?
                           ,[NgaySX] = ?
                           ,[Website] = ?
                           ,[SoLuong] = ?
                           ,[TrangThai] = ?
                      WHERE Ma = ?                             
                     """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, spNew.getTenSP());    
            ps.setObject(2, spNew.getNgaySX());    
            ps.setObject(3, spNew.getWebsite());    
            ps.setObject(4, spNew.getSoLuong());    
            ps.setObject(5, spNew.getTrangThai());    
            ps.setObject(6, spNew.getMaSP());
            
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public boolean deletegv(String ma) {
        String sql ="""
                    DELETE FROM [dbo].[SanPham]
                          WHERE Ma =?
                    """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
