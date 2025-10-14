package accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Controlador REST per a estudiants
@RestController
@RequestMapping("/api")
public class StudentController {
    // Endpoint per obtenir estudiants
    @GetMapping("/students")
    public String getStudent() {
        return "Endpoint get";
    }
   
    // Endpoint per afegir estudiants en lot
    @PostMapping("/students/batch")
    public String addStudent() {
        //TODO: processar petició POST
        return "student afegit";
    }
}
