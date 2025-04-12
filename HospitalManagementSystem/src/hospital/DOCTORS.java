public class DOCTORS extends javax.swing.JFrame {

    public DOCTORS() {
        initComponents();
        loadDoctorRecords();
    }

    private void initComponents() {
        // Initialize components for displaying doctor records
        // This may include a JTable for displaying records, buttons for editing and deleting, etc.
    }

    private void loadDoctorRecords() {
        // Logic to load doctor records from the database and display them in the GUI
    }

    private void editDoctorRecord(int doctorId) {
        // Logic to edit a specific doctor's record based on the provided doctorId
    }

    private void deleteDoctorRecord(int doctorId) {
        // Logic to delete a specific doctor's record based on the provided doctorId
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DOCTORS().setVisible(true);
            }
        });
    }
}