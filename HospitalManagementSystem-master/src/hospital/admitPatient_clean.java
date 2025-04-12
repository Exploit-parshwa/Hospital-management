package hospital;

import java.sql.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class admitPatient_clean extends javax.swing.JFrame implements Runnable {
    // Declare components
    private JTextField pad;
    private JLabel pat;
    private int hour, seconds, minutes;
    
    public admitPatient_clean() {
        initComponents();
        showDate();
        Thread t = new Thread(this);
        t.start();
    }
    
    private void initComponents() {
        // Initialize components
        pad = new JTextField();
        pat = new JLabel();
        // Add other component initializations as needed
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
                Thread.sleep(1000); // Prevent CPU overload
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new admitPatient_clean().setVisible(true);
        });
    }
}
