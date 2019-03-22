/*
CalcView.java
Alex M Brown

Creates the calculator view. The buttons are the user's method of interacting with the program.
*/

import javax.swing.*;
import java.awt.event.*;

public class CalcView{

    public CalcView(){}

    private static JTextField tfDisplay;

    public void update(String text){
        tfDisplay.setText(text);
    }

    
    public void display(){

        CalcController control = CalcController.getInstance();

        JFrame frame = new JFrame("Calculator");
        JButton btnOne = new JButton("1");
        JButton btnTwo = new JButton("2");
        JButton btnThree = new JButton("3");
        JButton btnFour = new JButton("4");
        JButton btnFive = new JButton("5");
        JButton btnSix = new JButton("6");
        JButton btnSeven = new JButton("7");
        JButton btnEight = new JButton("8");
        JButton btnNine = new JButton("9");
        JButton btnZero = new JButton("0");

        JButton btnEqual = new JButton("=");
        JButton btnClear = new JButton("C");
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnMultiply = new JButton("*");
        JButton btnDivide = new JButton("/");

        tfDisplay = new JTextField();


        btnOne.setBounds(10,70,50,50);
        btnTwo.setBounds(70,70,50,50);
        btnThree.setBounds(130,70,50,50);
        btnFour.setBounds(10,130,50,50);
        btnFive.setBounds(70,130,50,50);
        btnSix.setBounds(130,130,50,50);
        btnSeven.setBounds(10,190,50,50);
        btnEight.setBounds(70,190,50,50);
        btnNine.setBounds(130,190,50,50);
        btnZero.setBounds(10,250,50,50);

        btnEqual.setBounds(70,250,50,50);
        btnClear.setBounds(130,250,50,50);
        btnPlus.setBounds(200,70,50,50);
        btnMinus.setBounds(200,130,50,50);
        btnMultiply.setBounds(200,190,50,50);
        btnDivide.setBounds(200,250,50,50);

        tfDisplay.setBounds(10,10,240,50);
        tfDisplay.setEditable(false);
        tfDisplay.setText("");


        btnOne.addActionListener(control);
        btnTwo.addActionListener(control);
        btnThree.addActionListener(control);
        btnFour.addActionListener(control);
        btnFive.addActionListener(control);
        btnSix.addActionListener(control);
        btnSeven.addActionListener(control);
        btnEight.addActionListener(control);
        btnNine.addActionListener(control);
        btnZero.addActionListener(control);

        btnEqual.addActionListener(control);
        btnClear.addActionListener(control);
        btnPlus.addActionListener(control);
        btnMinus.addActionListener(control);
        btnMultiply.addActionListener(control);
        btnDivide.addActionListener(control);


        frame.add(btnOne);
        frame.add(btnTwo);
        frame.add(btnThree);
        frame.add(btnFour);
        frame.add(btnFive);
        frame.add(btnSix);
        frame.add(btnSeven);
        frame.add(btnEight);
        frame.add(btnNine);
        frame.add(btnZero);

        frame.add(btnEqual);
        frame.add(btnClear);
        frame.add(btnPlus);
        frame.add(btnMinus);
        frame.add(btnMultiply);
        frame.add(btnDivide);

        frame.add(tfDisplay);

        frame.setSize(260,350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}