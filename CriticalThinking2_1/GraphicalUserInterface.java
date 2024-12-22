import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;

public class GraphicalUserInterface extends JFrame implements ActionListener {
    private JButton depositButton = null;
    private JButton withdrawalButton = null;
    private JFormattedTextField depositField = null;
    private JFormattedTextField balanceField = null;
    private JFormattedTextField withdrawalField = null;

    // Constructor for JFrame
    GraphicalUserInterface() {
        GridBagConstraints layout = null;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        JLabel depositLabel = new JLabel("Deposit Amount : $");
        JLabel withdrawalLabel = new JLabel("Withdrawal Amount: $");
        JLabel balanceLabel = new JLabel("Balance");

        //JFrame's title
        setTitle("Banking App");

        //Buttons
        depositButton = new JButton("Deposit");
        depositButton.addActionListener(this);
        withdrawalButton = new JButton("Withdrawal");
        withdrawalButton.addActionListener(this);

        //Fields
        depositField = new JFormattedTextField(numberFormat);
        depositField.setEditable(true);
        depositField.setColumns(10);
        depositField.setValue(0.0);
        withdrawalField = new JFormattedTextField(numberFormat);
        withdrawalField.setEditable(true);
        withdrawalField.setColumns(10);
        withdrawalField.setValue(0.0);
        balanceField = new JFormattedTextField(currencyFormat);
        balanceField.setEditable(false);
        balanceField.setColumns(15);
        balanceField.setValue(0.0);

        //Layout
        setLayout(new GridBagLayout());

        //Label Layouts
        layout = new GridBagConstraints();
        layout.insets = new Insets(10, 10, 5, 1);
        layout.anchor = GridBagConstraints.LINE_END;
        layout.gridx = 0;
        layout.gridy = 0;
        add(depositLabel, layout);

        layout = new GridBagConstraints();
        layout.insets = new Insets(5, 10, 5, 1);
        layout.anchor = GridBagConstraints.LINE_END;
        layout.gridx = 0;
        layout.gridy = 1;
        add(withdrawalLabel, layout);

        layout = new GridBagConstraints();
        layout.insets = new Insets(5, 10, 10, 1);
        layout.anchor = GridBagConstraints.LINE_END;
        layout.gridx = 0;
        layout.gridy = 2;
        add(balanceLabel, layout);

        //Field Layouts
        layout = new GridBagConstraints();
        layout.insets = new Insets(10, 1, 5, 10);
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridx = 1;
        layout.gridy = 0;
        add(depositField, layout);

        layout = new GridBagConstraints();
        layout.insets = new Insets(5, 1, 5, 10);
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridx = 1;
        layout.gridy = 1;
        add(withdrawalField, layout);

        layout = new GridBagConstraints();
        layout.insets = new Insets(5, 1, 10, 10);
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridx = 1;
        layout.gridy = 2;
        add(balanceField, layout);

        //Button Layouts
        layout = new GridBagConstraints();
        layout.insets = new Insets(10, 5, 5, 10);
        layout.fill = GridBagConstraints.BOTH;
        layout.gridx = 2;
        layout.gridy = 0;
        add(depositButton, layout);

        layout = new GridBagConstraints();
        layout.insets = new Insets(5, 5, 10, 10);
        layout.fill = GridBagConstraints.BOTH;
        layout.gridx = 2;
        layout.gridy = 1;
        add(withdrawalButton, layout);
    }

    public void setBalanceField(Double newBalance) {
        balanceField.setValue(newBalance);
        balanceField.revalidate();
        balanceField.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Double ammount = 0.0;
        Double balance = Double.valueOf((Double) balanceField.getValue());
        JButton source =(JButton) event.getSource();

        if (source == depositButton) {
            ammount = ((Number) depositField.getValue()).doubleValue();
            System.out.println("Depositamount is :" + ammount);
            balanceField.setValue(balance += ammount);
            System.out.println("balanceField is now : " + balanceField.getValue());
        }
        else if (source == withdrawalButton) {
            ammount = ((Number) withdrawalField.getValue()).doubleValue();
            System.out.println("Withdrawalamount is :" + ammount);
            balanceField.setValue(balance -= ammount);
            System.out.println("balanceField is now : " + balanceField.getValue());
        }
    }
}