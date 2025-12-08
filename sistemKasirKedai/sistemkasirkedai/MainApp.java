package sistemkasirkedai;

package com.kedaikasir.sistemkasirkedai;

import com.formdev.flatlaf.FlatLightLaf; // Import FlatLaf
import com.kedaikasir.view.LoginFrame; // Import LoginFrame
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainApp {
    public static void main(String[] args) {
        try {
            // 1. Terapkan Look and Feel FlatLaf
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Gagal menerapkan Look and Feel");
        }

        // 2. Jalankan aplikasi di Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 3. Tampilkan halaman login pertama kali
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setLocationRelativeTo(null); // Posisikan di tengah layar
                loginFrame.setVisible(true);
            }
        });
    }
}