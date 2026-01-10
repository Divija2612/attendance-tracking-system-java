import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class MarkAttendanceFrame extends JFrame {

    public MarkAttendanceFrame() {
        setTitle("Student List");
        setSize(500, 300);
        setLocationRelativeTo(null);

        String[] cols = {"ID", "Name", "Roll No"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        JTable table = new JTable(model);

        StudentDAO dao = new StudentDAO();
        List<Student> students = dao.getAllStudents();

        for (Student s : students) {
            model.addRow(new Object[]{
                s.getId(),
                s.getName(),
                s.getRollNo()
            });
        }

        add(new JScrollPane(table));
        setVisible(true);
    }
}
