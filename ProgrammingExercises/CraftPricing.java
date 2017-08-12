import javax.swing.*;
import java.util.Objects;

public class CraftPricing {


    public static void main(String[] args) {
        String itemName = getItemName();
        double materialCost = getMaterialCost();
        double hoursWorked = getHoursWorked();
        double retailPrice = calculateRetailPrice(materialCost, hoursWorked);
        JOptionPane.showMessageDialog(null,itemName + " $ " + retailPrice);
    }

    public static String getItemName() {
        String ItemName = JOptionPane.showInputDialog(null,"What is the name of the product");
        return ItemName;
    }

    private static double getMaterialCost() {
        String materialCostsInput = JOptionPane.showInputDialog(null,"enter material costs");
        double materialCostsInputAsDouble = Double.parseDouble(materialCostsInput);
        double materialCost = materialCostsInputAsDouble + 12;
        return materialCost;

    }

    private static double getHoursWorked() {
        String hoursWorkedInput = JOptionPane.showInputDialog(null,"enter hours worked");
        double hoursWorked = Double.parseDouble(hoursWorkedInput);
        return hoursWorked;
    }

    public static double calculateRetailPrice(double materialCost, double hoursWorked) {
        double retailPrice = materialCost * hoursWorked;
        return retailPrice;
    }

}
