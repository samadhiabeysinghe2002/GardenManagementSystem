
package loginandsignup;

public class LoginAndSignup {

    public static void main(String[] args) {
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
    
    private boolean isValidEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailPattern);

    }
    
}
