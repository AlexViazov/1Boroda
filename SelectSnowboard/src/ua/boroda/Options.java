package ua.boroda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Reader extends JFrame {

        JButton b1, b2;
        JLabel l1, l2, l3, l4;
        JTextField t1, t2, t3;
        int i, i1, k, k1, m, m1;
        String a;
        eHandler handler = new eHandler();

        public Reader(String s){
            super(s);
            setLayout(new FlowLayout());
            b1 = new JButton("Clean");
            b2 = new JButton("Select");
            l1 = new JLabel("Write your height (in cm):");
            l2 = new JLabel("Write your weight (in kg):");
            l3 = new JLabel("Freestyle(1) or Freeride(2)");
            t1 = new JTextField(10);
            t2 = new JTextField(10);
            t3 = new JTextField(10);
            l4 = new JLabel("");
            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(l3);
            add(t3);
            add(b1);
            add(b2);
            add(l4);
            b2.addActionListener(handler);
            b1.addActionListener(handler);
        }

    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource()==b2){
                    i = Integer.parseInt(t1.getText());
                    i1 = i - 15;
                    k = Integer.parseInt(t2.getText());
                    if (k < (i - 100)){
                        k1 = i1 - 5;
                    } if (k >= (i - 100)){
                        k1 = i1 + 5;
                    }
                    m = Integer.parseInt(t3.getText());
                    if (m == 1){
                        m1 = k1 - 5;
                    } if (m == 2){
                        m1 = k1 + 5;
                    }
                    a = "Your board should be " + m1 + " cm";
                    l4.setText(a);
                }

                if(e.getSource()==b1){
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    l4.setText("");
                }
            }catch (Exception ex){ JOptionPane.showMessageDialog(null, "Arsehole, entry text as shown!!!"); }
        }

    }


}
