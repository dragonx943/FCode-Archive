/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Dra
 */
public class TamGiac {
    // thuộc tính của tam giác là 3 cạnh
    private int a;
    private int b;
    private int c;
    private int chuVi;
    
    // phương thức
    // tự gen code: constructor + set/get
    
    private String chuVi() {
        if (checkTamGiac()) {
            chuVi = a+b+c;
            return ", Chu vi = " + chuVi;
        } else return ", Khong phai tam giac!";
    }
    
    private boolean checkTamGiac() {
        if (a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0) {return true;} else return false;
    }
    
    void inThongTin() {
        System.out.println("Canh a = " + a + ", Canh b = " + b + ", Canh c = " + c + this.chuVi());
    }

    public TamGiac() {
        
    }

    public TamGiac(int a, int b, int c, int chuVi) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.chuVi = chuVi;
    }
    
    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getChuVi() {
        return chuVi;
    }

    public void setChuVi(int chuVi) {
        this.chuVi = chuVi;
    }
    
    
}
