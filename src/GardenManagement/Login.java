
package loginandsignup;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    

 private Model.userLogin model; 
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        model = new Model.userLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lab_copyright = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lab_login = new javax.swing.JLabel();
        lab_email = new javax.swing.JLabel();
        text_email = new javax.swing.JTextField();
        lab_password = new javax.swing.JLabel();
        text_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_copyright.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lab_copyright.setForeground(new java.awt.Color(255, 255, 255));
        lab_copyright.setText("All rights reserved. © 2023 GreenSprout Company");
        getContentPane().add(lab_copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hi\\Downloads\\logo.png")); // NOI18N
        jLabel2.setText("                    .");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 120, 90));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lab_login.setBackground(new java.awt.Color(255, 255, 255));
        lab_login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lab_login.setForeground(new java.awt.Color(0, 51, 0));
        lab_login.setText("LogIn");

        lab_email.setBackground(new java.awt.Color(255, 255, 255));
        lab_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_email.setText("Email :");

        text_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_email.setForeground(new java.awt.Color(153, 153, 153));
        text_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_emailActionPerformed(evt);
            }
        });

        lab_password.setBackground(new java.awt.Color(255, 255, 255));
        lab_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_password.setText("Password :");

        text_password.setForeground(new java.awt.Color(153, 153, 153));

        btn_login.setBackground(new java.awt.Color(0, 51, 0));
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LogIn");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lab_email)
                        .addComponent(lab_password)
                        .addComponent(text_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lab_login)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab_login)
                .addGap(18, 18, 18)
                .addComponent(lab_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lab_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 370, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hi\\Downloads\\Closeup_Texture_Mentha_Foliage_558219_1280x853.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        setSize(new java.awt.Dimension(1086, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void text_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_emailActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

            
       String username = text_email.getText();
                char[] passwordChars = text_password.getPassword();
                String password = new String(passwordChars);
                boolean isValidLogin = model.validateLogin(username, password);

                if (isValidLogin) {
                    // Open the student form or another form here
                    dispose(); 
                  Home newForm = new Home();

                    // Set the behavior of the new form (e.g., default close operation)
                    newForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    // Display the new form
                    newForm.pack();
                    newForm.setVisible(true);
                    // TODO add your handling code here:
                 
                } else {
                    displayMessage("Invalid username or password.");
                }    
    }//GEN-LAST:event_btn_loginActionPerformed

    
    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab_copyright;
    private javax.swing.JLabel lab_email;
    private javax.swing.JLabel lab_login;
    private javax.swing.JLabel lab_password;
    private javax.swing.JTextField text_email;
    private javax.swing.JPasswordField text_password;
    // End of variables declaration//GEN-END:variables

    private boolean isValidEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailPattern);
    }

    private boolean isValidPassword(String password) {
        String passwordPattern = "^(?=.*[0-9]).{8,}$";
        return password.matches(passwordPattern);
    }
}
