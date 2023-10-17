package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Test extends JFrame {
    
    private JPanel contentPane;
    private JScrollPane scrollPane;
    
    public Test() {
        initComponents();
    }

    private void initComponents() {

        //contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        // Create a JScrollPane to hold the content pane
        //scrollPane = new JScrollPane(contentPane);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Add a button to add text fields dynamically to the content pane
        JButton addButton = new JButton("Add TextField");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTextField();
            }
        });
        getContentPane().add(addButton, BorderLayout.SOUTH);
        pack();
    }
    
    private void addTextField() {
        JTextField textField = new JTextField("New TextField");
        contentPane.add(textField);
        contentPane.revalidate(); // Refresh the layout of the content pane
        scrollPane.revalidate(); // Refresh the layout of the scroll pane
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Test().setVisible(true);
        });
    }
}