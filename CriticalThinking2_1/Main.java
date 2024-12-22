import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String userInputBalance = JOptionPane.showInputDialog(null, "Enter the Initial Balance: ",
                "Initial Balance", JOptionPane.PLAIN_MESSAGE);
        Double initialBalance = 0.0;
        try {
            if (userInputBalance != null && !userInputBalance.isEmpty()) {
                initialBalance = Double.parseDouble(userInputBalance);
            }
        } catch (NumberFormatException e ) {
            JOptionPane.showMessageDialog(null, "Invalid Entry, Setting Balance to $0.0",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        GraphicalUserInterface myFrame = new GraphicalUserInterface();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setBalanceField(Double.valueOf(initialBalance));
        System.out.println("Initial Balance set to: $" + initialBalance);
    }
}