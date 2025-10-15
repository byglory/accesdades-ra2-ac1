package accesdades.ra2.ac1.accesdades_ra2_ac1.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import accesdades.ra2.ac1.accesdades_ra2_ac1.model.Student;
// Repositori per a accés a dades d'estudiants
@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate; 
    
    private static final class studentRowMapper implements RowMapper<Student>{
        @Override
        public Student mapRow(ResultSet rs, int arg1) throws SQLException {
            Student student = new Student();
            student.setId(rs.getLong("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            return student;
        }
    } 

    // Trobar tots els estudiants
    public List<Student> findAll(){
        String sql = "Select * from Students";
        return jdbcTemplate.query(sql, new studentRowMapper());
    }
    
    // Guardar estudiant
    public int save(){
        String sql = "insert into Students (name, age) values (?,?)";
        int numReg = jdbcTemplate.update(sql, "oriol",33);
        return numReg;
    }
}
