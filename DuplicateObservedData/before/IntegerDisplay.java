import java.awt.*;
import java.awt.event.*;

public class IntegerDisplay extends Frame implements ActionListener {
    private final Label _octalLabel = new Label("0");
    private final Label _decimalLabel = new Label("0");
    private final Label _hexadecimalLabel = new Label("0");
    private final Button _incrementButton = new Button("+");
    private final Button _decrementButton = new Button("-");

    private int _value = 0;

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
            setValue(_value + 1);
        } else if (e.getSource() == _decrementButton) {
            setValue(_value - 1);
        }
    }

    public int getValue() {
        return _value;
    }

    public void setValue(int value) {
        _value = value;
        _octalLabel.setText(Integer.toString(_value, 8));
        _decimalLabel.setText(Integer.toString(_value, 10));
        _hexadecimalLabel.setText(Integer.toString(_value, 16));
    }
}
