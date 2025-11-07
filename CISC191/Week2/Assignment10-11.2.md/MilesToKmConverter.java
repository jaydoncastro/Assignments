import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MilesToKmConverter extends JFrame {

    private JSpinner milesSpinner;
    private JLabel resultLabel;

    public MilesToKmConverter() {
        super("Miles to Kilometers Converter");

        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel milesLabel = new JLabel("Distance (miles):");

        // Spinner for numeric input
        SpinnerNumberModel model = new SpinnerNumberModel(0.0, 0.0, 10000.0, 0.1);
        milesSpinner = new JSpinner(model);

        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("");

        // Button listener
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertDistance();
            }
        });

        // Add components
        add(milesLabel);
        add(milesSpinner);
        add(new JLabel(""));
        add(convertButton);
        add(new JLabel("Kilometers:"));
        add(resultLabel);

        // Frame setup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void convertDistance() {
        double miles = (double) milesSpinner.getValue();
        double km = miles * 1.60934;
        resultLabel.setText(String.format("%.3f km", km));
    }

    public static void main(String[] args) {
        new MilesToKmConverter();
    }
}
