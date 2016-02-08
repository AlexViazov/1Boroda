package ua.boroda;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Reader r = new Reader("Select board!");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(300, 200);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}

