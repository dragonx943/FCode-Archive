/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Dra
 */
public class Main_MyLove {
    public static void main(String[] args) {
        // Tạo 1 đối tượng tên Hoa từ class MyLove
        MyLove Hoa = new MyLove(); // Gọi hàm tạo không tham số truyền vào
        System.out.println("Doi tuong Hoa: " + Hoa.toString());
        MyLove Huong = new MyLove("Huong"); // Gọi hàm tạo chỉ có tên truyền vào
        System.out.println("Doi tuong Huong: " + Huong.toString());
        MyLove Ha = new MyLove("Ha", 2006, 45.6); // Gọi hàm tạo đầy đủ tham số truyền vào
        System.out.println("Doi tuong Ha: "+ Ha.toString());
        Ha.setNamSinh(-2000);
        Ha.setCanNang(0);
        System.out.println("Doi tuong Ha sau thiet lap moi: " + Ha.toString());
    }
}
