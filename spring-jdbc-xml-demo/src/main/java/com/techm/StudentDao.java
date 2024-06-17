package com.techm;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao {

    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int saveStudent(Student student) {
        String query = "insert into student (stid, stname) values (?, ?)";
        return template.update(query, student.getStid(), student.getStname());
    }

    public Student getStudentById(int id) {
        String query = "select * from student where stid = ?";
        return template.queryForObject(query, new Object[]{id}, new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setStid(rs.getInt("stid"));
                student.setStname(rs.getString("stname"));
                return student;
            }
        });
    }

    public List<Student> getAllStudents() {
        String query = "select * from student";
        return template.query(query, new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setStid(rs.getInt("stid"));
                student.setStname(rs.getString("stname"));
                return student;
            }
        });
    }

    public int updateStudent(Student student) {
        String query = "update student set stname = ? where stid = ?";
        return template.update(query, student.getStname(), student.getStid());
    }

    public int deleteStudent(int id) {
        String query = "delete from student where stid = ?";
        return template.update(query, id);
    }
}
