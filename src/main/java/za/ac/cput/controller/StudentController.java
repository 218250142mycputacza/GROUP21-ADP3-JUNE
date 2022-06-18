package za.ac.cput.controller;

/*
Nawaaz Amien
219099839
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.api.StudentAPI;
import za.ac.cput.domain.Student;

import javax.validation.Valid;

@RestController
@RequestMapping("schoolmanagement/student/")
@Slf4j
public class StudentController {
    private final StudentAPI api;
    @Autowired
    public StudentController(StudentAPI api)
    {
        this.api=api;

    }

    @PostMapping("save")
    public ResponseEntity<Student> save(@Valid @RequestBody Student student) {
        // log.info("save request:{}", student);
        Student save = this.api.save(student);
        return ResponseEntity.ok(save);
    }
}

