import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SalaryCalculator extends JFrame {

    private JTextField wageField;
    private JTextField hoursField;
    private JLabel resultLabel;

    public SalaryCalculator() {
        // Window title
        super("Yearly Salary Calculator");

        // Layout
        setLayout(new GridLayout(4, 2, 10, 10));

        // Create components
        JLabel wageLabel = new JLabel("Hourly Wage:");
        wageField = new JTextField();

        JLabel hoursLabel = new JLabel("Hours per Week:");
        hoursField = new JTextField();

        JButton calculateButton = new JButton("Calculate Salary");
        resultLabel = new JLabel("");

        // Add ActionListener to button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSalary();
            }
        });

        // Add components to frame
        add(wageLabel);
        add(wageField);
        add(hoursLabel);
        add(hoursField);
        add(new JLabel("")); // empty cell
        add(calculateButton);
        add(new JLabel("Yearly Salary:"));
        add(resultLabel);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculateSalary() {
        try {
            double wage = Double.parseDouble(wageField.getText());
            double hours = Double.parseDouble(hoursField.getText());
            double yearly = wage * hours * 52; // 52 weeks per year
            resultLabel.setText(String.format("$%.2f", yearly));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new SalaryCalculator();
    }
}
