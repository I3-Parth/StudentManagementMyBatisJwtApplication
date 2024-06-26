package com.parth.StudentManagementMyBatisJwt.controller;

import com.parth.StudentManagementMyBatisJwt.dto.TeacherAdditionDto;
import com.parth.StudentManagementMyBatisJwt.dto.TeacherDisplayDto;
import com.parth.StudentManagementMyBatisJwt.dto.TeacherSubjectsDisplayDto;
import com.parth.StudentManagementMyBatisJwt.services.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping
    public List<TeacherDisplayDto> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public TeacherDisplayDto getTeacherById(@PathVariable(value = "id")Long id){
        return teacherService.getTeacherById(id);
    }

    @GetMapping("/{id}/subjects")
    public TeacherSubjectsDisplayDto findSubjectsByTeacherId(@PathVariable(value = "id")Long id){
        return teacherService.findSubjectsByTeacherId(id);
    }

    @PostMapping
    public TeacherDisplayDto addTeacher(@Valid @RequestBody TeacherAdditionDto teacherAdditionDto){
        return teacherService.addTeacher(teacherAdditionDto);
    }
}
