/*
Nombre: Valenzuela Romero Manuel Alejandro
Matricula:2022742
 */
package mx.edu.cesba.model;


public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public int phoneNumber;
    public double salary;
    public String hiredate;
    
   public void getDetails() { //METODO
        System.out.println("id:" + id);
        System.out.println("FirstName:" + firstName);
        System.out.println("LastName:" + lastName);
        System.out.println("Age:" + age);
        System.out.println("Email:" + email);
        System.out.println("PhoneNumber:" + phoneNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Hiredate:" + hiredate);
       
       
}

    
}
