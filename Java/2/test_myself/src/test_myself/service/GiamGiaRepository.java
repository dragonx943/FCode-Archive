/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_myself.service;

import java.util.ArrayList;
import java.sql.*;
import test_myself.DBConnect;
import test_myself.model.GiamGia;

public class GiamGiaRepository {
    Connection con;

    public GiamGiaRepository() {
        con = DBConnect.getConnection();
    }
    
    public ArrayList<GiamGia> getAll() {
        ArrayList<GiamGia> listGGs = new ArrayList<>();
        String sql = """
                     SELECT [Ma]
                           ,[Ten]
                           ,[HoaDonToiThieu]
                           ,[TienGiamToiDa]
                       FROM [ASM_GD2].[dbo].[PhieuGiamGia]
                     """;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiamGia gg = new GiamGia();
                gg.setMaPGG(rs.getString(1));
                gg.setTenPGG(rs.getString(2));
                gg.setHoaDonToiThieu(rs.getFloat(3));
                gg.setSoTienGiamToiDa(rs.getFloat(4));
                listGGs.add(gg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listGGs;
    }
    
    public Boolean add(GiamGia gg) {
        String sql = """
                     INSERT INTO [dbo].[PhieuGiamGia]
                                                      ([Ma]
                                                      ,[Ten]
                                                      ,[HoaDonToiThieu]
                                                      ,[TienGiamToiDa])
                                                VALUES
                                                      (?, ?, ?, ?);
                     """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, gg.getMaPGG());
            ps.setObject(2, gg.getTenPGG());
            ps.setObject(3, gg.getHoaDonToiThieu());
            ps.setObject(4, gg.getSoTienGiamToiDa());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public Boolean delete(String ma) {
        String sql = """
                     DELETE FROM [dbo].[PhieuGiamGia]
                           WHERE Ma LIKE ?
                     """;
        int check = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public ArrayList<GiamGia> search(Float min, Float max) {
        ArrayList<GiamGia> listGGs = new ArrayList<>();
        String sql = """
                     SELECT [Ma]
                           ,[Ten]
                           ,[HoaDonToiThieu]
                           ,[TienGiamToiDa]
                       FROM [ASM_GD2].[dbo].[PhieuGiamGia]
                       WHERE HoaDonToiThieu > ? AND HoaDonToiThieu < ?
                     """;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, min);
            ps.setFloat(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiamGia gg = new GiamGia();
                gg.setMaPGG(rs.getString(1));
                gg.setTenPGG(rs.getString(2));
                gg.setHoaDonToiThieu(rs.getFloat(3));
                gg.setSoTienGiamToiDa(rs.getFloat(4));
                listGGs.add(gg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listGGs;
    }
    
}
