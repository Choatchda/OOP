/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

/**
 *
 * @author 66876
 */
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return topN + "/" + btmN;
    }
    public String toFloat(){
        double ans = 1.0*topN/btmN;
        return ans + "";
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN+f.topN;
        } else{
            topN = topN*f.btmN+f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
    }
}