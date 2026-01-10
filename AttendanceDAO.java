
import java.sql.*;
import java.time.LocalDate;

public class AttendanceDAO {

    public void markAttendance(int studentId, String status) {
        String sql = "INSERT INTO attendance(student_id, date, status) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ps.setDate(2, Date.valueOf(LocalDate.now()));
            ps.setString(3, status);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
