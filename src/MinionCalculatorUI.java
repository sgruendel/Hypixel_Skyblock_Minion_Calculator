import javax.swing.*;
import java.awt.*;

public class MinionCalculatorUI {
    public static boolean isDouble(String str){
        try {
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean isInt(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void invalidInput(){
        JOptionPane.showMessageDialog(null, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void main(String[] args){
        MinionCaclulator minionCaclulator = new MinionCaclulator();

        String timeBetweenActions = JOptionPane.showInputDialog("Time between actions");
        if(isDouble(timeBetweenActions)){
            minionCaclulator.setTimeBetweenActions(Double.parseDouble(timeBetweenActions));
        }else{
            invalidInput();
        }
        String minionsWorking = JOptionPane.showInputDialog("Minions working");
        if(isInt(minionsWorking)){
            minionCaclulator.setMinionsWorking(Integer.parseInt(minionsWorking));
        }else{
            invalidInput();
        }
        String pricePerItem = JOptionPane.showInputDialog("Price per item");
        if(isDouble(pricePerItem)){
            minionCaclulator.setPricePerItem(Double.parseDouble(pricePerItem));
        }else{
            invalidInput();
        }

        System.out.println(minionCaclulator.calculateProfitPerHour());



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel labelTimeBetweenActions = new JLabel("Time between actions: " + timeBetweenActions);
        labelTimeBetweenActions.setForeground(Color.WHITE);
        labelTimeBetweenActions.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel labelMinionsWorking = new JLabel("Minions working: " + minionsWorking);
        labelMinionsWorking.setForeground(Color.WHITE);
        labelMinionsWorking.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel labelPricePerItem = new JLabel("Price per item: " + pricePerItem);
        labelPricePerItem.setForeground(Color.WHITE);
        labelPricePerItem.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel labelProfitPerHour = new JLabel("Projected profit per hour with current Minion setup: " + minionCaclulator.calculateProfitPerHour() + " coins.");
        labelProfitPerHour.setForeground(Color.WHITE);
        labelProfitPerHour.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel labelProfitPerDay = new JLabel("Projected profit per day with current Minion setup: " + minionCaclulator.calculateProfitPerDay() + " coins.");
        labelProfitPerDay.setForeground(Color.WHITE);
        labelProfitPerDay.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.add(panel);
        panel.add(labelTimeBetweenActions);
        panel.add(labelMinionsWorking);
        panel.add(labelPricePerItem);
        panel.add(Box.createVerticalStrut(75));
        panel.add(labelProfitPerHour);
        panel.add(labelProfitPerDay);
        frame.setVisible(true);
    }
}
