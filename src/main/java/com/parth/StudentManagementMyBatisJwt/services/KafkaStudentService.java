package com.parth.StudentManagementMyBatisJwt.services;

import com.parth.StudentManagementMyBatisJwt.dto.StudentAdditionDto;
import com.parth.StudentManagementMyBatisJwt.dto.StudentDisplayDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafkaStudentService {

  @Autowired
  StudentService studentService;

  @KafkaListener(topics = "student-info", groupId = "group1")
  public void addStudents(List<StudentAdditionDto> studentAdditionDtos) {
//    List<StudentDisplayDto> studentDisplayDtos = new ArrayList<>();
//    for (StudentAdditionDto studentAdditionDto : studentAdditionDtos) {
//      studentDisplayDtos.add(studentService.addStudent(studentAdditionDto));
//    }
    System.out.println(studentAdditionDtos);
  }
}
