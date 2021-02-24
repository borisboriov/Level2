package Lesson4.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

public class Chat {

    public static class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500, 500, 400, 300);
            setTitle("Demo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JLabel text = new JLabel("<blank>");
            add(text, BorderLayout.NORTH);

            JTextField field = new JTextField();
            add(field, BorderLayout.CENTER);
            field.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Your message: " + field.getText());
                    text.setText(((JTextField) e.getSource()).getText());
                    field.setText(null);
                }
            });

            field.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    if (e.isShiftDown()){
                        System.out.println("Shift down");
                    } else {
                        System.out.println(e.getKeyChar() + " down");
                    }
                }
            });


            JButton button = new JButton("Execute");
            add(button, BorderLayout.SOUTH);
            button.addActionListener(e -> {
                text.setText(field.getText());
                field.setText(null);
            });

            setVisible(true);
        }


    }


    public static void main(String[] args) {
        new MyWindow();
    }
}
