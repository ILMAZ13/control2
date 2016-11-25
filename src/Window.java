import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

/**
 * Created by ilmaz on 25.11.16.
 */
public class Window implements Runnable {
    private JFrame frame;
    private JPanel panel;
    private JTable table;

    @Override
    public void run() {
        frame = new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 800, 600);
        initElements();

        frame.setVisible(true);
    }

    private void initElements() {
        panel = new JPanel(new GridLayout(20, 2));
        panel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(15);
        panel.add(nameField);
        panel.add(new JLabel("Surname:"));
        JTextField surnameField = new JTextField(15);
        panel.add(surnameField);
        panel.add(new JLabel("Number:"));
        JTextField numberField = new JTextField(15);
        panel.add(numberField);
        panel.add(new JLabel("Bool:"));
        JCheckBox jCheckBox = new JCheckBox();
        panel.add(jCheckBox);
        JButton button = new JButton("Save");
        panel.add(button);
        frame.add(panel, BorderLayout.EAST);
        table = new JTable(new AbstractTableModel() {
            @Override
            public int getRowCount() {
                return 1;
            }

            @Override
            public int getColumnCount() {
                return 4;
            }

            @Override
            public Object getValueAt(int i, int i1) {
                return null;
            }
        });
        table.setRowHeight(30);

        frame.add(table);

    }
}
