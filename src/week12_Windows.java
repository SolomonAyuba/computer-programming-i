import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class week12_Windows {
    public static void main(String[] args) {
        // Windows
        JFrame frame = new JFrame("A Window");;

        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Buttons
        JFrame frame2 = new JFrame("A Button");
        JButton button = new JButton("Hello, Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame2, "Button Clicked!");
            }
        });
        frame2.add(button);
        frame2.setSize(250, 150);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

        // Labels
        JFrame frame3 = new JFrame("A Label");
        JLabel label = new JLabel("Java GUI!");
        frame3.add(label);

        frame3.setSize(250, 150);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);

        // Text Fields
        JFrame frame4 = new JFrame("A Text Field");
        JTextField textField = new JTextField("Type Here");

        frame4.add(textField);

        frame4.setSize(350, 250);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setVisible(true);

        //Checkboxes
        JFrame frame5 = new JFrame("A Checkbox");
        JCheckBox checkBox = new JCheckBox("Hey, Click Me");
        frame5.add(checkBox);

        frame5.setSize(250, 150);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setVisible(true);

        //Radio Buttons
        JFrame frame6 = new JFrame("A Radio Button");
        JRadioButton radioButton1 = new JRadioButton("Option A");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);

        frame6.add(radioButton1);

        frame6.setSize(250, 150);
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setVisible(true);

        // Sliders
        JFrame frame7 = new JFrame("A Slider");
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 120,70);
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Slider Value: " + slider.getValue());
            }
        });

        frame7.add(slider);

        frame7.setSize(250, 150);
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame7.setVisible(true);

        // Progress Bar
        JFrame frame8 = new JFrame("A Progress Bar");
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(60);

        frame8.add(progressBar);

        frame8.setSize(250, 150);
        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame8.setVisible(true);

        //Lists
        JFrame frame9 = new JFrame("A List");

        String[] items ={"Item A", "Item B", "Item C"};
        JList<String> list = new JList<>(items);

        frame9.add(list);

        frame9.setSize(250, 150);
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame9.setVisible(true);

        //Comboboxes
        JFrame frame10 = new JFrame("Combo Box");

        String[] options ={"Option A", "Option B", "Option C"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        frame10.add(comboBox);

        frame10.setSize(250, 150);
        frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame10.setVisible(true);

        //Text Areas
        JFrame frame11 = new JFrame("A Text Area");

        JTextArea textArea = new JTextArea("Type Here", 15, 25);
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame11.add(scrollPane);

        frame11.setSize(350, 250);
        frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame11.setVisible(true);

        // Menus and Bars
        JFrame frame12 = new JFrame("A Menu");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");

        menu.add(menuItem);
        menuBar.add(menu);

        frame12.setJMenuBar(menuBar);

        frame12.setSize(250, 150);
        frame12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame12.setVisible(true);

        // Tables
        JFrame frame13 = new JFrame("A Table");

        String[] columns = {"ID", "Name", "Age"};
        Object[][] data = {
                {1, "Solomon", 27},
                {2, "Jess", 20},
                {3, "Dan", 19}
        };

        JTable table = new JTable(new DefaultTableModel(data, columns));

        JScrollPane scrollPane1 = new JScrollPane(table);

        frame13.add(scrollPane1);

        frame13.setSize(250, 150);
        frame13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame13.setVisible(true);

        /*
        Mid-lesson question
        Create a simple Java graphical user interface (GUI) application that displays a window with a label.
        The title of the window should be "My GUI Window" The label should show a greeting message 'Hello, See my
        GUI Program!"' when the application is run.
        Write a Java program using the Swing library to achieve this.
         */
        SwingUtilities.invokeLater(()-> createAndShowGUI());
    }

    private static void createAndShowGUI(){
        JFrame frame = new JFrame("My GUI Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, See my GUI Program!");;
        frame.getContentPane().add(label);

        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window on the screen
        frame.setVisible(true);

    }
}
