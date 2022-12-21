import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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
        rbCustomer.addChangeListener(event ->{
            if (rbCustomer.isSelected()){
                tfMonths.setEnabled(false);
                tfSalary.setEnabled(false);
            } else {
                tfMonths.setEnabled(true);
                tfSalary.setEnabled(true);
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

    static void giveReward(int n) {


    }
}
