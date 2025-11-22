package org.calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame frame;
    private JPanel resultPanel, inputPanel;


    public Calculator() {

        frame = new JFrame("Cool Calculator");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        buildResultPanel();
        buildInputPanel();

        frame.add(resultPanel, BorderLayout.NORTH);
        frame.add(inputPanel,  BorderLayout.CENTER);


        frame.setVisible(true);
    }


    private void buildResultPanel() {

        resultPanel = new JPanel();
        resultPanel.setBorder(BorderFactory.createEmptyBorder(100, 20, 20, 20));
        resultPanel.setBackground(Color.lightGray);

    }

    private void buildInputPanel() {

        inputPanel = new JPanel();
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        inputPanel.setBackground(Color.darkGray);

    }



}
