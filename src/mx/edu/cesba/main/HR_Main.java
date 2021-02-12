/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

public class HR_Main {
    public static void main (String[] args){
        //  Creacion de objetos
        Employee e1=new Employee();
        Employee e2=new Employee();
        
        
        e1.id= 1;
        e1.firstName= "Tiburcio";
        e1.lastName= "Smith";
        e1.age= 20;
        e1.email="tiburcio@cesba.edu.mx";
        e1.phoneNumber=1213456789;
        e1.salary=30000.25;
        e1.hiredate="02-02-21";
        
        e2.id= 2;
        e2.firstName= "Felipa";
        e2.lastName= "Perez";
        e2.age= 30;
        e2.email="felipa@cesba.edu.mx";
        e2.phoneNumber=967650321;
        e2.salary=33000.33;
        e2.hiredate="01-01-21";
        
        e1.getDetails();
        System.out.print("------------------------------");
        e2.getDetails();
    }
}
