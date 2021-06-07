/*Project created and maintained by Kajetan Warmbier
* Contact info: k.warmbier.436@studms.ug.edu.pl*/

package com.company.Liczydlo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Liczydlo extends JFrame implements ActionListener{

    private final JTextField liczbaAInput;
    private final JTextField liczbaBInput;
    private final JTextField wynikOutput;
    private final JButton btnPlus;
    private final JButton btnMinus;
    private final JButton btnMultiply;
    private final JButton btnDivide;
    private final JButton btnModulo;
    private final JButton btnCzysc;

    public Liczydlo() throws HeadlessException {
        super("Liczydlo");

        /*Button elements*/
        btnPlus = new JButton("+");
        btnPlus.addActionListener(this);
        btnPlus.setFocusPainted(false);
        btnPlus.setBackground(new Color(225,225,225));

        btnMinus = new JButton("-");
        btnMinus.addActionListener(this);
        btnMinus.setFocusPainted(false);
        btnMinus.setBackground(new Color(225,225,225));

        btnMultiply = new JButton("*");
        btnMultiply.addActionListener(this);
        btnMultiply.setFocusPainted(false);
        btnMultiply.setBackground(new Color(225,225,225));

        btnDivide = new JButton("/");
        btnDivide.addActionListener(this);
        btnDivide.setFocusPainted(false);
        btnDivide.setBackground(new Color(225,225,225));

        btnModulo = new JButton("%");
        btnModulo.addActionListener(this);
        btnModulo.setFocusPainted(false);
        btnModulo.setBackground(new Color(225,225,225));

        btnCzysc = new JButton("Czysc");
        btnCzysc.addActionListener(this);
        btnCzysc.setFocusPainted(false);
        btnCzysc.setBackground(new Color(225,225,225));

        /*Text elements*/
        /*JTextField used in order to properly set text horizontally and vertically*/
        JTextField liczbaA = new JTextField("Liczba A");
        liczbaA.setEditable(false);
        liczbaA.setBackground(null);
        liczbaA.setHorizontalAlignment(SwingConstants.LEFT);
        liczbaA.setBorder(null);

        JTextField liczbaB = new JTextField("Liczba B");
        liczbaB.setEditable(false);
        liczbaB.setBackground(null);
        liczbaB.setHorizontalAlignment(SwingConstants.LEFT);
        liczbaB.setBorder(null);

        JTextField wynik = new JTextField("Wynik");
        wynik.setBackground(null);
        wynik.setEditable(false);
        wynik.setHorizontalAlignment(SwingConstants.LEFT);
        wynik.setBorder(null);

        /*Input/output elements*/
        liczbaAInput = new JTextField("");
        liczbaAInput.setHorizontalAlignment(SwingConstants.RIGHT);
        liczbaBInput = new JTextField("");
        liczbaBInput.setHorizontalAlignment(SwingConstants.RIGHT);
        wynikOutput = new JTextField("");
        wynikOutput.setHorizontalAlignment(SwingConstants.RIGHT);
        wynikOutput.setEditable(false);


        /*GridLayout for mainPanel*/
        GridLayout mainPanelLayout = new GridLayout(6,2);
        mainPanelLayout.setHgap(15);
        mainPanelLayout.setVgap(5);
        /*mainPanel*/
        JPanel mainPanel = new JPanel(mainPanelLayout);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5,1,5,1));
        mainPanel.add(btnPlus);
        mainPanel.add(btnMinus);
        mainPanel.add(btnMultiply);
        mainPanel.add(btnDivide);
        mainPanel.add(btnModulo);
        mainPanel.add(btnCzysc);
        mainPanel.add(liczbaA);
        mainPanel.add(liczbaAInput);
        mainPanel.add(liczbaB);
        mainPanel.add(liczbaBInput);
        mainPanel.add(wynik);
        mainPanel.add(wynikOutput);


        setContentPane(mainPanel);
        setSize(450, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent wynik) {


        /*Catch input A exceptions without disturbing btnCzysc*/
        if (wynik.getSource() == btnCzysc) {
            liczbaAInput.setText("");
            liczbaBInput.setText("");
            wynikOutput.setText("");
        } else {

            try {
                double testDoubA = Double.parseDouble(liczbaAInput.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Została wprowadzona nieprawidłowa liczba A", "Ostrzeżenie", JOptionPane.WARNING_MESSAGE);
            }

        }

        /*Assign double doubA without disturbing btnCzysc*/
        double doubA = Double.parseDouble(liczbaAInput.getText());

        /*Catch input B exceptions*/
        if (wynik.getSource() == btnCzysc) {
            liczbaAInput.setText("");
            liczbaBInput.setText("");
            wynikOutput.setText("");
        } else {

            try {
                double testDoubA = Double.parseDouble(liczbaBInput.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Została wprowadzona nieprawidłowa liczba B", "Ostrzeżenie", JOptionPane.WARNING_MESSAGE);
            }

        }

        /*Assign double doubB*/
        double doubB = Double.parseDouble(liczbaBInput.getText());

        /*btnPlus functionality*/
        if (wynik.getSource() == btnPlus) {
            double wynikRownania = doubA + doubB;
            wynikOutput.setText(Double.toString(wynikRownania));
        }

        /*btnMinus functionality*/
        if (wynik.getSource() == btnMinus) {
            double wynikRownania = doubA - doubB;
            wynikOutput.setText(Double.toString(wynikRownania));
        }

        /*btnMultiply functionality*/
        if (wynik.getSource() == btnMultiply) {
            double wynikRownania = doubA * doubB;
            wynikOutput.setText(Double.toString(wynikRownania));
        }

        /*btnDivide functionality*/
        if (wynik.getSource() == btnDivide) {
            if (Double.parseDouble(liczbaBInput.getText()) == 0) {
                JOptionPane.showMessageDialog(this, "Pamiętaj cholero, nie dziel przez zero! \n Liczba B nie może być równa 0", "Ostrzeżenie", JOptionPane.WARNING_MESSAGE);
            } else {
                double wynikRownania = doubA / doubB;
                wynikOutput.setText(Double.toString(wynikRownania));
            }
        }

        /*btnModulo functionality*/
        if (wynik.getSource() == btnModulo) {
            if (Double.parseDouble(liczbaBInput.getText()) == 0) {
                JOptionPane.showMessageDialog(this, "Pamiętaj cholero, nie moduluj przez zero! \n Liczba B nie może być równa 0", "Ostrzeżenie", JOptionPane.WARNING_MESSAGE);
            } else {
                double wynikRownania = doubA % doubB;
                wynikOutput.setText(Double.toString(wynikRownania));
            }
        }

    }




    public static void main (String[] args) {
        SwingUtilities.invokeLater(Liczydlo::new);
    }
}
