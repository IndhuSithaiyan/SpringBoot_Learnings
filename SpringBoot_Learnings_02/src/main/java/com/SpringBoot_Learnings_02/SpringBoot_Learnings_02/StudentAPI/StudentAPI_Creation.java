package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.StudentAPI;

import com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans.Student;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentAPI_Creation {

    @GetMapping(value = "/studentInfo/{id}/{name}/{degree}")
    public ResponseEntity<Student> getStudentInfo(@PathVariable int id,
                                                  @PathVariable String name,
                                                  @PathVariable String degree){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setDegree(degree);
        return ResponseEntity.ok(student);
    }
}
