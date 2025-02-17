/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Владислав
 */
public class CalculatorGUI extends JFrame implements ActionListener{
     JPanel panel;
     JButton button;
     JTextField f1, f2;
     JLabel label;
    
    public CalculatorGUI(){
        super("меню для использования гуи");
        panel = new JPanel();
        getContentPane().add(panel);
        
        button = new JButton("нажмите для сложения");
        f1 = new JTextField(30);
        f2 = new JTextField(30);
        label = new JLabel("здесь будет результат");
        
        button.setActionCommand("Ok");
        button.addActionListener(this);
        panel.add(button);
        panel.add(f1);
        panel.add(f2);
        panel.add(label);
        
        JButton buttonMultiply = new JButton("multiply");
        buttonMultiply.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               double a = Double.parseDouble(f1.getText());
               double b = Double.parseDouble(f2.getText());
               label.setText(Double.toString(Calculator.multiply(a, b)));
            }
        });
        panel.add(buttonMultiply);

        
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if(str.equals("Ok")){
            double a = Double.parseDouble(f1.getText());
            double b = Double.parseDouble(f2.getText());
            label.setText(Double.toString(Calculator.add(a, b)));
        }
    }
}
