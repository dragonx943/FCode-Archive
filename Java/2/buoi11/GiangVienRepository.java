package buoi11;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class GiangVienRepository {
    Connection con;

    public GiangVienRepository() {
        con = DBConnect.getConnection();
    }
    
    // Trả về 1 danh sách gv
    public ArrayList<GiangVien> getAll() {
        ArrayList<GiangVien> lstGVs = new ArrayList<>();
        // lấy dữ liệu từ sql
        // gõ """
        String sql = """
                     SELECT [ma]
                           ,[ten]
                           ,[loai]
                           ,[tuoi]
                           ,[bac]
                           ,[gioi_tinh]
                       FROM [dbo].[giang_vien]
                     """;
        // try-catch: xử lý ngoại lệ => try + ctrl + space
        // try: chứa code có thể xảy ra lỗi
        // catch: bắt lỗi xảy ra trong try
        // import java.sql.Connection
        try {
            // import java.sql.PreparedStatement
            // tạo đối tượng ps thực thi câu lệnh sql
            PreparedStatement ps = con.prepareStatement(sql);
            // ResultSet: nhận kết quả trả về dưới dạng bảng
            // executeQuery(): thực hiện câu truy vấn
            ResultSet rs = ps.executeQuery();
            // rs.next(): kiểm tra xem còn dòng dữ liệu không
            while (rs.next()) {
                // 1. Tạo đối tượng GV mới
                GiangVien gv = new GiangVien();
                // 2. Lấy dữ liệu từ bảng gán vào đối tượng
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setTuoi(rs.getInt(4));
                gv.setBac(rs.getInt(5));
                gv.setGioi_tinh(rs.getInt(6));
                // 3. Thêm đối tượng gv vào danh sách
                lstGVs.add(gv);
            }
        } catch (Exception e) {
            e.printStackTrace(); // in thông tin về lỗi
        }
        return lstGVs;
    }
    
    public ArrayList<GiangVien> sort() {
        ArrayList<GiangVien> lstGVs = new ArrayList<>();
        // lấy dữ liệu từ sql
        // gõ """
        String sql = """
                     SELECT [ma]
                           ,[ten]
                           ,[loai]
                           ,[tuoi]
                           ,[bac]
                           ,[gioi_tinh]
                       FROM [dbo].[giang_vien]
                       ORDER BY ten ASC
                     """;
        // try-catch: xử lý ngoại lệ => try + ctrl + space
        // try: chứa code có thể xảy ra lỗi
        // catch: bắt lỗi xảy ra trong try
        // import java.sql.Connection
        try {
            // import java.sql.PreparedStatement
            // tạo đối tượng ps thực thi câu lệnh sql
            PreparedStatement ps = con.prepareStatement(sql);
            // ResultSet: nhận kết quả trả về dưới dạng bảng
            // executeQuery(): thực hiện câu truy vấn
            ResultSet rs = ps.executeQuery();
            // rs.next(): kiểm tra xem còn dòng dữ liệu không
            while (rs.next()) {
                // 1. Tạo đối tượng GV mới
                GiangVien gv = new GiangVien();
                // 2. Lấy dữ liệu từ bảng gán vào đối tượng
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setTuoi(rs.getInt(4));
                gv.setBac(rs.getInt(5));
                gv.setGioi_tinh(rs.getInt(6));
                // 3. Thêm đối tượng gv vào danh sách
                lstGVs.add(gv);
            }
        } catch (Exception e) {
            e.printStackTrace(); // in thông tin về lỗi
        }
        return lstGVs;
    }
    
    public ArrayList<GiangVien> searchFT() {
        ArrayList<GiangVien> lstGVs = new ArrayList<>();
        // lấy dữ liệu từ sql
        // gõ """
        String sql = """
                     SELECT [ma]
                           ,[ten]
                           ,[loai]
                           ,[tuoi]
                           ,[bac]
                           ,[gioi_tinh]
                       FROM [dbo].[giang_vien]
                       WHERE loai LIKE ?
                     """;
        // try-catch: xử lý ngoại lệ => try + ctrl + space
        // try: chứa code có thể xảy ra lỗi
        // catch: bắt lỗi xảy ra trong try
        // import java.sql.Connection
        try {
            // import java.sql.PreparedStatement
            // tạo đối tượng ps thực thi câu lệnh sql
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, "Loai 1");
            // ResultSet: nhận kết quả trả về dưới dạng bảng
            // executeQuery(): thực hiện câu truy vấn
            ResultSet rs = ps.executeQuery();
            // rs.next(): kiểm tra xem còn dòng dữ liệu không
            while (rs.next()) {
                // 1. Tạo đối tượng GV mới
                GiangVien gv = new GiangVien();
                // 2. Lấy dữ liệu từ bảng gán vào đối tượng
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setTuoi(rs.getInt(4));
                gv.setBac(rs.getInt(5));
                gv.setGioi_tinh(rs.getInt(6));
                // 3. Thêm đối tượng gv vào danh sách
                lstGVs.add(gv);
            }
        } catch (Exception e) {
            e.printStackTrace(); // in thông tin về lỗi
        }
        return lstGVs;
    }
    
    // Tìm kiếm gv theo mã
    public GiangVien getOne(String ma) {
        String sql = """
                     SELECT [ma]
                           ,[ten]
                           ,[loai]
                           ,[tuoi]
                           ,[bac]
                           ,[gioi_tinh]
                       FROM [dbo].[giang_vien]
                       WHERE ma LIKE ?
                     """;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // set cái dấu ?
            ps.setObject(1, ma); // cho dấu ? số mấy
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiangVien gv = new GiangVien();
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setLoai(rs.getString(3));
                gv.setTuoi(rs.getInt(4));
                gv.setBac(rs.getInt(5));
                gv.setGioi_tinh(rs.getInt(6));
                return gv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // Thêm 1 đối tượng vào bảng -> INSERT
    // INSERT -> Thêm
    // UPDATE -> Sửa
    // DELETE -> Xoá
    // --> Trả về số dòng được thực hiện -> executeUpdate
    public boolean addGV(GiangVien gv) {
        String sql = """
                     INSERT INTO [dbo].[giang_vien]
                                ([ma]
                                ,[ten]
                                ,[loai]
                                ,[tuoi]
                                ,[bac]
                                ,[gioi_tinh])
                          VALUES
                                (?, ?, ?, ?, ?, ?)
                     """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, gv.getMa());
            ps.setObject(2, gv.getTen());
            ps.setObject(3, gv.getLoai());
            ps.setObject(4, gv.getTuoi());
            ps.setObject(5, gv.getBac());
            ps.setObject(6, gv.getGioi_tinh());
            
            check = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return check > 0;
        // check = 1 -> 1 > 0 return true
        // else: false
    }
    
    public boolean updateGV(GiangVien gv) {
        // gõ 3 lần dấu nháy kép
        // không sửa mã gv
        String sql = """
                     UPDATE [dbo].[giang_vien]
                        SET [ten] = ?,
                            [loai] = ?,
                            [tuoi] = ?,
                            [bac] = ?,
                            [gioi_tinh] = ?
                     WHERE ma = ?
                     """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, gv.getTen());
            ps.setObject(2, gv.getLoai());
            ps.setObject(3, gv.getTuoi());
            ps.setObject(4, gv.getBac());
            ps.setObject(5, gv.getGioi_tinh());
            ps.setObject(6, gv.getMa());
            
            check = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return check > 0;
    }
    
    public boolean deletegv(String ma) {
        String sql = "DELETE FROM [dbo].[giang_vien] WHERE ma = ?";
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
    
    public static void main(String[] args) {
        GiangVienRepository repo = new GiangVienRepository();
        ArrayList<GiangVien> list = repo.getAll();
        for (GiangVien gv: list) {
            gv.inThongTin();
        }
        
        System.out.println("==================");
        
        
        GiangVien gvTimKiem = repo.getOne("PhongTT35");
        gvTimKiem.inThongTin();
        
        // test 1 lần phần dưới này
        // update giảng viên đã tồn tại
        // giữ nguyên mã -> không sửa
        boolean testUpdate = repo.updateGV(new GiangVien("BacNX120", "Như Trang", "Loại 2", 45, 3, 0));
        System.out.println("Test update GV: " + testUpdate);
    }
}