import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class DistanceConverter extends JFrame {

    private JFormattedTextField milesField;
    private JLabel kmLabel;
    private JLabel mLabel;
    private JLabel ftLabel;

    public DistanceConverter() {
        super("Distance Converter");

        setLayout(new GridLayout(5, 2, 10, 10));

        // Create number formatter for numeric input only
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        milesField = new JFormattedTextField(numberFormat);
        milesField.setColumns(10);

        JLabel milesLabel = new JLabel("Distance (miles):");
        JButton convertButton = new JButton("Convert");

        kmLabel = new JLabel("");
        mLabel = new JLabel("");
        ftLabel = new JLabel("");

        // Button listener
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertDistance();
            }
        });

        // Add components
        add(milesLabel);
        add(milesField);
        add(new JLabel(""));
        add(convertButton);
        add(new JLabel("Kilometers:"));
        add(kmLabel);
        add(new JLabel("Meters:"));
        add(mLabel);
        add(new JLabel("Feet:"));
        add(ftLabel);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void convertDistance() {
        try {
            double miles = Double.parseDouble(milesField.getText());
            double km = miles * 1.60934;
            double meters = km * 1000;
            double feet = miles * 5280;

            kmLabel.setText(String.format("%.3f km", km));
            mLabel.setText(String.format("%.2f m", meters));
            ftLabel.setText(String.format("%.2f ft", feet));
        } catch (NumberFormatException ex) {
            kmLabel.setText("Invalid input!");
            mLabel.setText("");
            ftLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new DistanceConverter();
    }
}
