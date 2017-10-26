import java.awt.*;
import java.awt.event.*;

public class IntegerDisplay extends Frame implements ActionListener, ValueListener {
    private final Label _octalLabel = new Label("0");
    private final Label _decimalLabel = new Label("0");
    private final Label _hexadecimalLabel = new Label("0");
    private final Button _incrementButton = new Button("+");
    private final Button _decrementButton = new Button("-");

    private Value _value = new Value(0);

    public IntegerDisplay() {
        super("IntegerDisplay");

        setLayout(new GridLayout(4, 2));
        add(new Label("Octal:"));
        add(_octalLabel);
        add(new Label("Decimal:"));
        add(_decimalLabel);
        add(new Label("Hexadecimal:"));
        add(_hexadecimalLabel);
        add(_incrementButton);
        add(_decrementButton);

        _incrementButton.addActionListener(this);
        _decrementButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == _incrementButton) {
            setValue(_value.getValue() + 1);
        } else if (e.getSource() == _decrementButton) {
            setValue(_value.getValue() - 1);
        }
    }

    public int getValue() {
        return _value.getValue();
    }

    public void setValue(int value) {
        _value.setValue(value);
        _octalLabel.setText(Integer.toString(_value.getValue(), 8));
        _decimalLabel.setText(Integer.toString(_value.getValue(), 10));
        _hexadecimalLabel.setText(Integer.toString(_value.getValue(), 16));
    }

    public void valueChanged(ValueChangeEvent e) {
    }
}
