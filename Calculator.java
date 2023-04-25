import acm.program.*;
import javax.swing.*;
import java.awt.*;
import acm.gui.*;
import java.awt.event.*;

public class Calculator  extends DialogProgram {

    DoubleField screen = new DoubleField();
    Accumulator acc = new Accumulator();

    public void init() {
        screen.setPreferredSize(new Dimension(200,25));

        //Addition
        JButton additionButton = new JButton("+");
        additionButton.addActionListener(this);
        //Subtraction
        JButton subButton = new JButton("-");
        subButton.addActionListener(this);
        //Division
        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this); 
        //Multiplication
        JButton multiButton = new JButton("*");
        multiButton.addActionListener(this);
        //Clear button
        JButton ceButton = new JButton("CE");
        ceButton.addActionListener(this);
        //Equal
        JButton equalButton = new JButton("=");
        equalButton.addActionListener(this);
        //Percentage
        JButton percentButton = new JButton("%");
        percentButton.addActionListener(this);
        //Square root
        JButton sqrButton = new JButton("SQR");
        sqrButton.addActionListener(this);
        //dot
        JButton dotButton = new JButton(".");
        dotButton.addActionListener(this);
        //Does nothing
        JButton nothingButton = new JButton(" ");
        nothingButton.addActionListener(this);
        //Numbers
        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(this);
        JButton oneButton = new JButton("1");
        oneButton.addActionListener(this);
        JButton twoButton = new JButton("2");
        twoButton.addActionListener(this);
        JButton threeButton = new JButton("3");
        threeButton.addActionListener(this);
        JButton fourButton = new JButton("4");
        fourButton.addActionListener(this);
        JButton fiveButton = new JButton("5");
        fiveButton.addActionListener(this);
        JButton sixButton = new JButton("6");
        sixButton.addActionListener(this);
        JButton sevenButton = new JButton("7");
        sevenButton.addActionListener(this);
        JButton eightButton = new JButton("8");
        eightButton.addActionListener(this);
        JButton nineButton = new JButton("9");
        nineButton.addActionListener(this);


        //Panels
        JPanel samplePanel = new JPanel();
        samplePanel.add(ceButton);
        samplePanel.add(sqrButton);
        samplePanel.add(percentButton);
        samplePanel.add(divideButton);
        samplePanel.add(oneButton);
        samplePanel.add(twoButton);
        samplePanel.add(threeButton);
        samplePanel.add(multiButton);
        samplePanel.add(fourButton);
        samplePanel.add(fiveButton);
        samplePanel.add(sixButton);
        samplePanel.add(subButton);
        samplePanel.add(sevenButton);
        samplePanel.add(eightButton);
        samplePanel.add(nineButton);
        samplePanel.add(additionButton);
        samplePanel.add(zeroButton);
        samplePanel.add(nothingButton);
        samplePanel.add(dotButton);
        samplePanel.add(equalButton);

        add(samplePanel);
        samplePanel.setLayout(new GridLayout(5, 2, 2, 2));

        JPanel inputPanel = new JPanel();
        FlowLayout layout = new FlowLayout();
        inputPanel.setLayout(layout);
        inputPanel.add(screen);
        add(samplePanel, "Center");
        add(inputPanel, "North");
    }

    //Clicking test
    public void actionPerformed(ActionEvent e) {
        String clicked = e.getActionCommand();

        if (clicked == "+") {
            acc.calculate(screen.getValue(), "+");
            screen.setText("");
        }
        if (clicked == "-") {
            acc.calculate(screen.getValue(), "-");
            screen.setText("");
        }
        if (clicked == "/") {
            acc.calculate(screen.getValue(), "/");
            screen.setText("");
        }
        if (clicked == "*") {
            acc.calculate(screen.getValue(), "*");
            screen.setText("");
        }
        if (clicked == "CE") {
            screen.setText("");
            acc.resetAcc();
        }
        if (clicked == "%") {
            acc.calculate(screen.getValue(), "%");
            screen.setText("");
        }
        if (clicked == "SQR") {
            acc.calculate(screen.getValue(), "SQR");
            screen.setValue(acc.getValue());
        }
        if (clicked == "0") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "1") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "2") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "3") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "4") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "5") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "6") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "7") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "8") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "9") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == ".") {
            screen.setText(screen.getText() + clicked);
        }
        if (clicked == "=") {
            acc.calculate(screen.getValue(), "=");
            screen.setValue(acc.getValue());
            acc.resetAcc();
        }

    }
}
