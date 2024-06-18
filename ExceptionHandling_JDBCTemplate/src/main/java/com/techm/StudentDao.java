package com.techm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveStudent(Student student) {
        String query = "INSERT INTO student (stid, stname) VALUES (?, ?)";
        try {
            return jdbcTemplate.update(query, student.getStid(), student.getStname());
        } catch (DataAccessException e) {
            System.err.println("Error inserting student: " + e.getMessage());
            return 0;
        }
    }

    public Student getStudentById(int id) {
        String query = "SELECT * FROM student WHERE stid = ?";
        try {
            return jdbcTemplate.queryForObject(query, new Object[]{id}, new RowMapper<Student>() {
                @Override
                public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Student student = new Student();
                    student.setStid(rs.getInt("stid"));
                    student.setStname(rs.getString("stname"));
                    return student;
                }
            });
        } catch (DataAccessException e) {
            System.err.println("Error fetching student by ID: " + e.getMessage());
            return null;
        }
    }

    public List<Student> getAllStudents() {
        String query = "SELECT * FROM student";
        try {
            return jdbcTemplate.query(query, new RowMapper<Student>() {
                @Override
                public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Student student = new Student();
                    student.setStid(rs.getInt("stid"));
                    student.setStname(rs.getString("stname"));
                    return student;
                }
            });
        } catch (DataAccessException e) {
            System.err.println("Error fetching all students: " + e.getMessage());
            return null;
        }
    }

    public int updateStudent(Student student) {
        String query = "UPDATE student SET stname = ? WHERE stid = ?";
        try {
            return jdbcTemplate.update(query, student.getStname(), student.getStid());
        } catch (DataAccessException e) {
            System.err.println("Error updating student: " + e.getMessage());
            return 0;
        }
    }

    public int deleteStudent(int id) {
        String query = "DELETE FROM student WHERE stid = ?";
        try {
            return jdbcTemplate.update(query, id);
        } catch (DataAccessException e) {
            System.err.println("Error deleting student: " + e.getMessage());
            return 0;
        }
    }
}
