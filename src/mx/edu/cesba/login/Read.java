/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.login;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 *
 */
public class Read extends javax.swing.JFrame {

    Conexion con =new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
    
    
    
    
    /**
     * Creates new form Read
     */
    public Read() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        this.setResizable(false);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_phonenumber = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_hiredate = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTA DE EMPLEADOS");

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "FirstName", "LastName", "Age", "Email", "PhoneNumber", "Salary", "HireDate"
            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        jLabel2.setText("Id");

        jLabel3.setText("FirstName");

        jLabel4.setText("LastName");

        jLabel5.setText("Age");

        jLabel6.setText("Email");

        jLabel7.setText("PhoneNumber");

        jLabel8.setText("Salary");

        jLabel9.setText("HireDate");

        txt_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastnameKeyTyped(evt);
            }
        });

        txt_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ageKeyTyped(evt);
            }
        });

        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });

        txt_phonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phonenumberKeyTyped(evt);
            }
        });

        txt_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salaryKeyTyped(evt);
            }
        });

        txt_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstnameKeyTyped(evt);
            }
        });

        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_return.setText("Return Menu");

        btn_borrar.setForeground(new java.awt.Color(255, 0, 0));
        btn_borrar.setText("Borrar");

        btn_actualizar.setText("Actualizar");

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_hiredate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_borrar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_return))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btn_agregar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_consultar)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(txt_age)
                            .addComponent(txt_email)
                            .addComponent(txt_phonenumber)
                            .addComponent(txt_salary)
                            .addComponent(txt_firstname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(94, 94, 94))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_consultar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_hiredate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_return)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_id.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_age.setText("");
        txt_email.setText("");
        txt_phonenumber.setText("");
        txt_salary.setText("");
        txt_hiredate.setText("");
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
      
        int age = Integer.parseInt(txt_age.getText());
            if (age <=17){
                getToolkit().beep();
                //evt.consume();
                JOptionPane.showMessageDialog(null,"Favor de ingresar edad mayor a 18 años");
                }else{
            Agregar();
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
                listar();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void txt_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ageKeyTyped
                char solonumero=evt.getKeyChar();
                if (Character.isLetter(solonumero)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros");
                }
                   
                
           

    }//GEN-LAST:event_txt_ageKeyTyped
    
    private void txt_phonenumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phonenumberKeyTyped
       char solonumero=evt.getKeyChar();
                if (Character.isLetter(solonumero)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros");
                }
                 
                
                 
    }//GEN-LAST:event_txt_phonenumberKeyTyped

    private void txt_salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salaryKeyTyped
        char solonumero=evt.getKeyChar();
                if (Character.isLetter(solonumero)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros");
                }
    }//GEN-LAST:event_txt_salaryKeyTyped

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
       char solonumero=evt.getKeyChar();
                if (Character.isLetter(solonumero)){
                    getToolkit().beep();
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"Ingresa solo numeros");
                }
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstnameKeyTyped
       char c=evt.getKeyChar();
       if(Character.isLowerCase(c)){
           String cad=(""+c).toUpperCase();
           c=cad.charAt(0);
           evt.setKeyChar(c);
           
       }
       if (Character.isDigit(c)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null,"Ingresa solo texto");
       }
    }//GEN-LAST:event_txt_firstnameKeyTyped

    private void txt_lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastnameKeyTyped
        char c=evt.getKeyChar();
       if(Character.isLowerCase(c)){
           String cad=(""+c).toUpperCase();
           c=cad.charAt(0);
           evt.setKeyChar(c);
           
       }
       if (Character.isDigit(c)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null,"Ingresa solo texto");
       }
    }//GEN-LAST:event_txt_lastnameKeyTyped

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
 char c=evt.getKeyChar();
       if(Character.isLowerCase(c)){
           String cad=(""+c).toUpperCase();
           c=cad.charAt(0);
           evt.setKeyChar(c);
           
       }
            // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Read().setVisible(true);
            }
        });
    }
    void listar (){
        String sql = "select * from employee";
        try{
            cn=con.getConnection();
            st =cn.createStatement();
            rs=st.executeQuery(sql);
            Object [] empleado= new Object [8];
            modelo=(DefaultTableModel)TablaDatos.getModel();
            while(rs.next()){
                empleado[0]=rs.getInt("id");
                empleado[1]=rs.getString("FirstName");
                empleado[2]=rs.getString("LastName");
                empleado[3]=rs.getInt("age");
                empleado[4]=rs.getString("email");
                empleado[5]=rs.getInt("phoneNumber");
                empleado[6]=rs.getDouble("salary");
                empleado[7]=rs.getString("HireDate");
                modelo.addRow(empleado);
            
                
            }
            TablaDatos.setModel(modelo);
            
        }catch (Exception e){
    }
    }
    
    void Agregar(){
        int id=Integer.parseInt(txt_id.getText());
        String firstName =txt_firstname.getText();
        String lastName =txt_lastname.getText();
        int age=Integer.parseInt(txt_age.getText());
        String email =txt_email.getText();
        int phoneNumber=Integer.parseInt(txt_phonenumber.getText());
        Double salary=Double.parseDouble(txt_salary.getText());
        String hireDate =(txt_hiredate.getText().trim());
        try{
            String sql = "INSERT INTO employee (id,firstName,lastName,age,email,phoneNumber,salary,hireDate)values('"+ id +"', '"+firstName+"','"+lastName+"','"+age+"','"+email+"','"+phoneNumber+"','"+salary+"','"+hireDate+"')";
                    
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    limpiartable();
                    
        }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Datos no se guardaron correctamente");
        
                    
        }
    }
    void limpiartable(){
        for (int i=0; 1<=TablaDatos.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hiredate;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_phonenumber;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}
