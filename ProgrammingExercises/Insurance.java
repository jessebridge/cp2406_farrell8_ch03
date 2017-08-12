import javax.swing.*;

public class Insurance {


    public static void main(String[] args) {
        int birthYear = getUserBirth();
        int currentYear = getCurrentYear();
        int howManyDecades = calculateDecades(birthYear,currentYear);
        int calculateInsurance = calculateInsuranceForUser(howManyDecades);
        JOptionPane.showMessageDialog(null," your insurance will cost $" + calculateInsurance);


    }

    public static int getUserBirth(){
        String userAgeInput = JOptionPane.showInputDialog(null," What year were you born?  ");
        int userBirth = Integer.parseInt(userAgeInput);
        return userBirth;
    }

    public static int getCurrentYear(){
        String yearInput = JOptionPane.showInputDialog(null,"What is the current year? ");
        int currentYear = Integer.parseInt(yearInput);
        return currentYear;
    }
    public static int calculateDecades(int birthYear, int currentYear){
        int decades = ((currentYear - birthYear) / 10);
        return decades;
    }


    public static int calculateInsuranceForUser(int howManyDecades){
        int insuranceCost = ((howManyDecades + 15) * 20);
        return  insuranceCost;
    }




}
