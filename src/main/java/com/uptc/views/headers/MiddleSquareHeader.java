package com.uptc.views.headers;

import javax.swing.BorderFactory;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import com.uptc.views.Command;
import com.uptc.views.Header;
import com.uptc.views.JButtonRounded;

public class MiddleSquareHeader extends Header {

    private JTextField seed;
    private JTextField digits;
    private JSpinner max;
    private JSpinner min;
    private JTextField quantity;
    private JButtonRounded generate;

    public MiddleSquareHeader(ActionListener listener) {
        this.seed = new JTextField();
        this.digits = new JTextField("4");
        this.max = new JSpinner();
        this.min = new JSpinner();
        this.quantity = new JTextField();
        this.generate = new JButtonRounded(5, 5, "Generar Numeros");
        this.setLayout(new GridLayout(2, 3, 5, 2));
        initComponents(listener);
    }
    
    private void initComponents(ActionListener listener) {
        seed.setBorder(BorderFactory.createTitledBorder("Semilla"));
        this.add(seed);
        
        max.setBorder(BorderFactory.createTitledBorder("Maximo"));
        max.setBackground(Color.WHITE);
        max.setValue(1);
        this.add(max);

        digits.setBorder(BorderFactory.createTitledBorder("Digitos"));
        digits.setBackground(Color.WHITE);
        this.add(digits);

        quantity.setBorder(BorderFactory.createTitledBorder("Cantidad"));
        this.add(quantity);

        min.setBorder(BorderFactory.createTitledBorder("Minimo"));
        min.setBackground(Color.WHITE);
        this.add(min);

        generate.addActionListener(listener);
        generate.setActionCommand(Command.GENERATE_MIDD.name());
        this.add(generate);
    }

    @Override
    public int getSeed() {
        return Integer.valueOf(seed.getText());
    }

    @Override
    public int getQuantity() {
        return Integer.valueOf(quantity.getText());
    }

    @Override
    public int getDigits() {
        return Integer.valueOf(digits.getText());
    }

    @Override
    public int getMax() {
        return Integer.valueOf(max.getValue().toString());
    }

    @Override
    public int getMin() {
        return Integer.valueOf(min.getValue().toString());
    }
}
