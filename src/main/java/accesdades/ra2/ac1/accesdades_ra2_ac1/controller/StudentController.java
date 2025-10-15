package accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import accesdades.ra2.ac1.accesdades_ra2_ac1.model.Student;
import accesdades.ra2.ac1.accesdades_ra2_ac1.repository.StudentRepository;
    


// Controlador REST per a estudiants
@RestController
@RequestMapping("/api")
public class StudentController { 

    
    @Autowired
    StudentRepository studentRepository;

    // Endpoint per obtenir estudiants
    @GetMapping("/students")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
   
    // Endpoint per afegir estudiants en lot
    @PostMapping("/students/batch")
    public String addStudent() {
        //TODO: processar petició POST
        int numReg = studentRepository.save();
        return "Has afegit " + numReg + " registre/s";
    }
}
