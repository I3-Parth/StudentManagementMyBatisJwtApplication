package com.parth.StudentManagementMyBatisJwt.services;

import com.parth.StudentManagementMyBatisJwt.dto.StudentAdditionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaStudentService {

  @Autowired
  StudentService studentService;

  @KafkaListener(topics = "student-info", groupId = "group1")
  public void addStudents(StudentAdditionDto studentAdditionDtos){
//    List<StudentDisplayDto> studentDisplayDtos = new ArrayList<>();
//    ObjectMapper objectMapper = new ObjectMapper();
//    for (StudentAdditionDto studentAdditionDto : studentAdditionDtos) {
//      StudentAdditionDto studentAdditionDto1 = objectMapper.readValue(studentAdditionDto.toString(), StudentAdditionDto.class);
//      studentDisplayDtos.add(studentService.addStudent(studentAdditionDto1));
//    }

//    ObjectMapper objectMapper = new ObjectMapper();
//    List<Map<String, StudentAdditionDto>> studentAdditionDtos = (List<Map<String, StudentAdditionDto>>) objectMapper.readValue(payload, StudentAdditionDto.class);
//
//    for(Map<String, StudentAdditionDto> studentAdditionDtoMap: studentAdditionDtos){
//      StudentAdditionDto studentAdditionDto = new StudentAdditionDto();
//      studentAdditionDto.setName((String) studentAdditionDtoMap.get("name"));
//    }

//    System.out.println("students data: "+ payload);
//    List<StudentDisplayDto> studentDisplayDtos = new ArrayList<>();
//    for (StudentAdditionDto studentAdditionDto : studentAdditionDtos) {
//      System.out.println("current Student: "+ studentAdditionDto);
//      studentDisplayDtos.add(studentService.addStudent(studentAdditionDto));
//    }
    System.out.println(studentAdditionDtos);
  }
}
