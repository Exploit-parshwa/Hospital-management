package hospital;

import java.sql.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class admitPatient_original extends javax.swing.JFrame implements Runnable {
    // Declare components as instance variables
    private JTextField pad;
    private JLabel pat;
    private int hour, seconds, minutes;
    
    public admitPatient_original() {
        initComponents();
        showDate();
        Thread t = new Thread(this);
        t.start();
    }
    
    private void initComponents() {
        // Initialize all components here
        pad = new JTextField();
        pat = new JLabel();
        // Add other component initializations
    }
    
    void showDate() {
        Date d = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        pad.setText(sd.format(d));
    }

    @Override
    public void run() {
        while(true) {
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minutes = cal.get(Calendar.MINUTE);
            seconds = cal.get(Calendar.SECOND);
    
            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss:aa");
            Date dat = cal.getTime();
            String time24 = sdf24.format(dat);
            pat.setText(time24);
            
            try {
                Thread.sleep(1000); // Update every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Add other original methods here
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new admitPatient_original().setVisible(true);
        });
    }
}
