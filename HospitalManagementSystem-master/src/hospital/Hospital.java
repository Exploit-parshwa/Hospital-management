package hospital;

public class Hospital {
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(
                javax.swing.UIManager.getSystemLookAndFeelClassName());
            
            LoginPage login = new LoginPage();
            login.setVisible(true);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null,
                "Error starting application: " + e.getMessage(),
                "Startup Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
}
