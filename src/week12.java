import javax.swing.*;

public class week12 {
    public static void main(String[] args) {

        // For spacing between codes
        String space = "---------";
        System.out.println(space + "WEEK 12: Graphical User Interface Programming | Tue 23rd, July 2024" + space);
        //WEEK 12: Graphical User Interface Programming | Tue 23rd Jul, 2024

        //Creating a swing application
        JFrame frame = new JFrame ("A Swing Application");

        // Create a JButton (button)
        JButton button = new JButton("Hello, Click Me");

        // Add an action listener to the button
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button, Clicked"));

        // Add the button to the frame
        frame.add(button);

        // Set window properties
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
