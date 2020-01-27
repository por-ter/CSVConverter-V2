package com.app;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class App {
    
    static ConverterUI run;

    public static void main(String[] args) {
        
        createApp();
        
    }
    
    public static void createApp() {
        
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        run = new ConverterUI();
        
        
        java.net.URL iconURL = ClassLoader.getSystemResource("resources/nasdoIcon.png");

        ImageIcon icon = new ImageIcon(iconURL);
        run.setIconImage(icon.getImage());
        
        
        run.setVisible(true);
        
    }

}
