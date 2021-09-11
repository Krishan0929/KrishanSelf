package com.KrishanSelf.KrishanSelf.controller;

import com.KrishanSelf.KrishanSelf.model.course;
import com.KrishanSelf.KrishanSelf.model.student;
import com.KrishanSelf.KrishanSelf.service.KrishanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KrishanController
{
    @Autowired
    public KrishanService krishanService;

    @GetMapping("/students")
    public List<student> getAllStudents()
    {
        return krishanService.getAllStudents();
    }

    @GetMapping("/students/{student_id}")
    public student getsudentById(@PathVariable(name = "student_id") int id)
    {
        return krishanService.getStudentById(id);
    }

    @GetMapping("/students/{student_id}/courses")
    public List<course> getCourseForStudent(@PathVariable(name = "student_id") int id) {

        return krishanService.getCourseForStudent(id);
    }

    @GetMapping("/courses/{course_id}/students")
    public List<student> getStudentForCourse(@PathVariable(name = "course_id") int id) {

        return krishanService.getStudentForCourse(id);
    }
}
