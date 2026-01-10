
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Attendance Tracking System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton addStudentBtn = new JButton("Add Student");
        JButton markAttendanceBtn = new JButton("Mark Attendance");

        addStudentBtn.addActionListener(e -> {
            new AddStudentFrame();
        });

        markAttendanceBtn.addActionListener(e -> {
            new MarkAttendanceFrame();
        });

        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.add(addStudentBtn);
        panel.add(markAttendanceBtn);

        add(panel);
        setVisible(true);
    }
}

/*javac -cp ".;postgresql-42.7.8.jar" -d bin *.java
java -cp "bin;postgresql-42.7.8.jar" Main*/

