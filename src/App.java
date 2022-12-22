import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JPanel pnlMain;
    private JRadioButton rbCustomer;
    private JRadioButton rbClerk;
    private JRadioButton rbManager;
    private JTextField tfName;
    private JTextArea taPersons;
    private JButton btnSave;
    private JTextField tfAge;
    private JTextField tfMonths;
    private JTextField tfSalary;
    private JButton btnClear;
    private JTextField tfLoad;
    private JButton btnLoad;
    private JButton btnSayHi;
    private JButton btnSavePerson;
    private JButton btnLoadPerson;
    private JButton btnReward;

    private List<Person> persons;

    public App() {
        persons = new ArrayList<>();
        ButtonGroup GroupButton = new ButtonGroup();
        GroupButton.add(rbCustomer);
        GroupButton.add(rbClerk);
        GroupButton.add(rbManager);

        // TODO add implementations for all milestones here
        rbCustomer.addChangeListener(event -> {
            if (rbCustomer.isSelected()) {
                tfMonths.setEnabled(false);
                tfSalary.setEnabled(false);
            } else {
                tfMonths.setEnabled(true);
                tfSalary.setEnabled(true);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                tfName.setText(null);
                tfAge.setText(null);
                tfMonths.setText(null);
                tfSalary.setText(null);
                tfLoad.setText(null);
            }
        });
    }

    public static void main(String[] args) {
        // add here how to make GUI visible
            App Zane = new App();
            Zane.setTitle("Person App");
            Zane.setContentPane(Zane.pnlMain);
            Zane.setSize(1280, 720);
            Zane.setDefaultCloseOperation(EXIT_ON_CLOSE);
            Zane.setVisible(true);
        }
}
