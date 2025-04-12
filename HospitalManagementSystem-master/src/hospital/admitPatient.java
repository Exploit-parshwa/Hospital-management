package hospital;

import javax.swing.*;
import java.sql.*;

public class admitPatient extends javax.swing.JFrame {
    // Form components
    private JTextField patientIdField;
    private JTextField patientNameField;
    private JTextField diseaseField;
    private JButton submitButton;

    public admitPatient() {
        initComponents();
    }

    private void initComponents() {
        // Initialize form components
        patientIdField = new JTextField(10);
        patientNameField = new JTextField(20);
        diseaseField = new JTextField(20);
        submitButton = new JButton("Submit");
        
        submitButton.addActionListener(e -> addPatientToDatabase());
        
        // Add components to form layout
        JPanel panel = new JPanel();
        panel.add(new JLabel("Patient ID:"));
        panel.add(patientIdField);
        panel.add(new JLabel("Name:"));
        panel.add(patientNameField);
        panel.add(new JLabel("Disease:"));
        panel.add(diseaseField);
        panel.add(submitButton);
        
        this.add(panel);
        this.pack();
    }

    private void addPatientToDatabase() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO paitient_record (id, PatientName, PatientDisease) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, patientIdField.getText());
            stmt.setString(2, patientNameField.getText());
            stmt.setString(3, diseaseField.getText());
            
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Patient record added successfully!");
                clearFields();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error saving patient: " + ex.getMessage(), 
                "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearFields() {
        patientIdField.setText("");
        patientNameField.setText("");
        diseaseField.setText("");
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new admitPatient().setVisible(true);
        });
    }
}
