import javax.swing.*;
import java.awt.*;

public class AddStudentFrame extends JFrame {

    public AddStudentFrame() {
        setTitle("Add Student");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField nameField = new JTextField(15);
        JTextField rollField = new JTextField(15);

        JButton saveBtn = new JButton("Save");

        saveBtn.addActionListener(e -> {
            StudentDAO dao = new StudentDAO();
            dao.addStudent(nameField.getText(), rollField.getText());
            JOptionPane.showMessageDialog(this, "Student Added!");
            dispose();
        });

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Roll No:"));
        panel.add(rollField);
        panel.add(saveBtn);

        add(panel);
        setVisible(true);
    }
}
