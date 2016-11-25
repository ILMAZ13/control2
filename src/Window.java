import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.LinkedList;

/**
 * Created by ilmaz on 25.11.16.
 */
public class Window implements Runnable {
    private JFrame frame;
    private JPanel panel;
    private JTable table;
    private java.util.List<User> users;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField numberField;
    private JCheckBox jCheckBox;

    @Override
    public void run() {
        frame = new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 800, 600);
        initElements();

        frame.setVisible(true);
    }

    private void initElements() {
        users = new LinkedList<>();
        panel = new JPanel(new GridLayout(20, 2));
        panel.add(new JLabel("Name:"));
        nameField = new JTextField(15);
        panel.add(nameField);
        panel.add(new JLabel("Surname:"));
        surnameField = new JTextField(15);
        panel.add(surnameField);
        panel.add(new JLabel("Number:"));
        numberField = new JTextField(15);
        panel.add(numberField);
        panel.add(new JLabel("Bool:"));
        jCheckBox = new JCheckBox();
        panel.add(jCheckBox);
        JButton button = new JButton("Save");
        button.addActionListener(actionEvent -> {
            User user = new User(nameField.getText(), surnameField.getText(), numberField.getText(), jCheckBox.isSelected());
            users.add(user);
            table.updateUI();
        });
        panel.add(button);
        frame.add(panel, BorderLayout.EAST);
        table = new JTable(new AbstractTableModel() {
            @Override
            public int getRowCount() {
                return users.size();
            }

            @Override
            public int getColumnCount() {
                return 4;
            }

            @Override
            public Object getValueAt(int i, int i1) {
                switch (i1) {
                    case 0:
                        return users.get(i).getName();
                    case 1:
                        return users.get(i).getSurName();
                    case 2:
                        return users.get(i).getNumber();
                    case 3:
                        return users.get(i).isBool();
                    default:
                        return null;
                }
            }
        });
        table.setRowHeight(30);

        frame.add(table);

    }
}
