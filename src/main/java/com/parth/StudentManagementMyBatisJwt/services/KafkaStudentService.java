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

  @KafkaListener(topics = "student-info1", groupId = "group1", containerFactory = "kafkaListenerContainerFactory")
  public StudentDisplayDto addStudents(StudentAdditionDto studentAdditionDto){
    System.out.println(studentAdditionDto);
    return studentService.addStudent(studentAdditionDto);
  }
}
