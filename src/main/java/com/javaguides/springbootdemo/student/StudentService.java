package com.javaguides.springbootdemo.student;

import com.javaguides.springbootdemo.student.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "abc",
                        "abc@gmail.com",
                        LocalDate.of(1998, Month.SEPTEMBER,02),
                        25

                )
        );
    }
}
