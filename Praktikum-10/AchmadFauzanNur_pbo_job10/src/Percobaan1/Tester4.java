/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ojan
 */
public class Tester4 {
     public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        PermanenEmployee pEmp = new PermanenEmployee("Kevin", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------------");
        
        IntershipEmployee iEmp = new IntershipEmployee("Sadewa", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-------------------------------");
        ow.showMyEmployee(iEmp);
    }
}