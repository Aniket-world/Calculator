package Src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SimplifiedCalculator window = new SimplifiedCalculator();
                window.getFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

class SimplifiedCalculator {
    private JFrame frame;
    private JTextField textField;
    private JPanel buttonPanel;
    private Color darkGray = new Color(60, 63, 65);
    private Color black = new Color(43, 43, 43);
    private Color orange = new Color(255, 165, 0);

    public SimplifiedCalculator() {
        initialize();
    }

    public JFrame getFrame() {
        return frame;
    }

    private void initialize() {
        frame = new JFrame("Simplified Calculator");
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBackground(darkGray);
        textField.setForeground(Color.WHITE);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        frame.getContentPane().add(textField, BorderLayout.NORTH);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
        buttonPanel.setBackground(darkGray);
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);

        // Adding buttons to the panel
        addButton("7", black, Color.WHITE);
        addButton("8", black, Color.WHITE);
        addButton("9", black, Color.WHITE);

        addButton("4", black, Color.WHITE);
        addButton("5", black, Color.WHITE);
        addButton("6", black, Color.WHITE);

        addButton("1", black, Color.WHITE);
        addButton("2", black, Color.WHITE);
        addButton("3", black, Color.WHITE);

        addButton("0", black, Color.WHITE);
        addButton(".", black, Color.WHITE);
        addButton("+", darkGray, orange);
        addButton("-", darkGray, orange);
        addButton("=", black, orange);

        // Add a border around the frame
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, orange));

        frame.setVisible(true);
    }

    private void addButton(String text, Color bgColor, Color fgColor) {
        JButton btn = new JButton(text);
        btn.setBackground(bgColor);
        btn.setForeground(fgColor);
        btn.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPanel.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add your calculation logic here
            }
        });
    }
}
