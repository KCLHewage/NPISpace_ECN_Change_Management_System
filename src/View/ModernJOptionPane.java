package View; 

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.UIManager;
        
        import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class ModernJOptionPane extends JOptionPane {

    // Override the showMessageDialog method to set custom colors for buttons and icons
    public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType) {
        // Set a custom header color using the UIManager property
        UIManager.put("OptionPane.background", new Color(56, 142, 60));
        UIManager.put("Panel.background", new Color(56, 142, 60));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 16));

        // Get the default options for the message type
        Object[] options = getOptionsForMessageType(messageType);

        // Create an array of custom buttons with custom foreground and background colors
        JButton[] customButtons = Arrays.stream(options)
                .map(option -> {
                    JButton button = new JButton(option.toString());
                    button.setForeground(Color.WHITE);
                    button.setBackground(new Color(76, 175, 80));
                    return button;
                })
                .toArray(JButton[]::new);

        // Set the custom buttons for the message dialog
        UIManager.put("OptionPane.buttonAreaBorder", BorderFactory.createEmptyBorder());
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 14));
        UIManager.put("OptionPane.buttonForeground", Color.WHITE);
        UIManager.put("OptionPane.buttonBackground", new Color(76, 175, 80));
        JOptionPane optionPane = new JOptionPane(message, messageType, JOptionPane.DEFAULT_OPTION, null, customButtons, null);
        JDialog dialog = optionPane.createDialog(parentComponent, title);
        dialog.setVisible(true);

        // Get the selected option from the custom buttons
        Object selectedOption = optionPane.getValue();

        // Set the custom icon with a custom foreground color
        Icon icon = getIconForMessageType(messageType);
        if (icon != null) {
            JLabel iconLabel = (JLabel) dialog.getContentPane().getComponent(0);
            iconLabel.setIcon(icon);
            iconLabel.setForeground(Color.WHITE);
        }

        // Return the index of the selected option in the options array
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(selectedOption)) {
                //return i;
            }
        }
        //return -1;
    }

    // Helper method to get the default options for a given message type
    private static Object[] getOptionsForMessageType(int messageType) {
        switch (messageType) {
            case ERROR_MESSAGE:
            case WARNING_MESSAGE:
            case QUESTION_MESSAGE:
                return new Object[]{"Yes", "No"};
            case INFORMATION_MESSAGE:
            case PLAIN_MESSAGE:
            default:
                return new Object[]{"OK"};
        }
    }

    // Helper method to get the default icon for a given message type
    private static Icon getIconForMessageType(int messageType) {
        switch (messageType) {
            case ERROR_MESSAGE:
                return UIManager.getIcon("OptionPane.errorIcon");
            case WARNING_MESSAGE:
                return UIManager.getIcon("OptionPane.warningIcon");
            case QUESTION_MESSAGE:
                return UIManager.getIcon("OptionPane.questionIcon");
            case INFORMATION_MESSAGE:
            case PLAIN_MESSAGE:
            default:
                return UIManager.getIcon("OptionPane.informationIcon");
        }
    }
}*/


public class ModernJOptionPane extends JOptionPane {
    
   /* public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType) {
        // Set a custom header color using the UIManager property
        UIManager.put("OptionPane.background", new Color(14,119,89));
        UIManager.put("Panel.background", new Color(14,119,89));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 16));

        // Get the default options for the message type
        Object[] options = getOptionsForMessageType(messageType);

        // Create an array of custom buttons with custom foreground and background colors
        JButton[] customButtons = Arrays.stream(options)
                .map(option -> {
                    JButton button = new JButton(option.toString());
                    button.setForeground(Color.WHITE);
                    button.setBackground(new Color(76, 175, 80));
                    return button;
                })
                .toArray(JButton[]::new);

        // Set the custom buttons for the message dialog
        UIManager.put("OptionPane.buttonAreaBorder", BorderFactory.createEmptyBorder());
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 14));
        UIManager.put("OptionPane.buttonForeground", Color.WHITE);
        UIManager.put("OptionPane.buttonBackground", new Color(76, 175, 80));
        JOptionPane optionPane = new JOptionPane(message, messageType, JOptionPane.DEFAULT_OPTION, null, customButtons, null);
        JDialog dialog = optionPane.createDialog(parentComponent, title);
        dialog.setVisible(true);

        // Set the custom icon with a custom foreground color
        Icon icon = getIconForMessageType(messageType);
        if (icon != null) {
            JLabel iconLabel = (JLabel) dialog.getContentPane().getComponent(0);
            iconLabel.setIcon(icon);
            iconLabel.setForeground(Color.WHITE);
        }
    }

    // Helper method to get the default options for a given message type
    private static Object[] getOptionsForMessageType(int messageType) {
        switch (messageType) {
            case ERROR_MESSAGE:
            case WARNING_MESSAGE:
            case QUESTION_MESSAGE:
                return new Object[]{"Yes", "No"};
            case INFORMATION_MESSAGE:
            case PLAIN_MESSAGE:
            default:
                return new Object[]{"OK"};
        }
    }

    // Helper method to get the default icon for a given message type
    private static Icon getIconForMessageType(int messageType) {
        switch (messageType) {
            case ERROR_MESSAGE:
                return UIManager.getIcon("OptionPane.errorIcon");
            case WARNING_MESSAGE:
                return UIManager.getIcon("OptionPane.warningIcon");
            case QUESTION_MESSAGE:
                return UIManager.getIcon("OptionPane.questionIcon");
            case INFORMATION_MESSAGE:
            case PLAIN_MESSAGE:
            default:
                return UIManager.getIcon("OptionPane.informationIcon");
        }
    }*/
    
    // Override the showMessageDialog method to display a custom message box
    
    public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType) {
        // Set a custom header color using the UIManager property
        UIManager.put("OptionPane.background", new Color(14,119,89));
        UIManager.put("Panel.background", new Color(14,119,89));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", new Font("Dialog", Font.BOLD, 16));
    
        // Show the message dialog with the custom header color
        JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
    }
    
    
}
