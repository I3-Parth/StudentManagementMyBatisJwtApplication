package com.parth.StudentManagementMyBatisJwt.services;

import com.parth.StudentManagementMyBatisJwt.dto.SubjectAdditionDto;
import com.parth.StudentManagementMyBatisJwt.dto.SubjectDisplayDto;
import com.parth.StudentManagementMyBatisJwt.dto.SubjectTeacherDisplayDto;
import com.parth.StudentManagementMyBatisJwt.mapstructMapper.SubjectMapper;
import com.parth.StudentManagementMyBatisJwt.model.SubjectEntity;
import com.parth.StudentManagementMyBatisJwt.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectMapper subjectMapper;

    @Autowired
    SubjectRepository subjectRepository;

    public List<SubjectDisplayDto> getAllSubjects(){
        return subjectMapper.convertListOfSubjectEntityToSubjectDisplayDto(subjectRepository.findAllSubjects());
    }

    public SubjectTeacherDisplayDto getSubjectById(Long id){
        return subjectMapper.convertSubjectEntityToSubjectTeacherDisplayDto(subjectRepository.findSubjectById(id));
    }

    public SubjectDisplayDto addSubject(SubjectAdditionDto subjectAdditionDto){
        SubjectEntity subjectEntity = subjectMapper.convertSubjectAdditionDtoToSubjectEntity(subjectAdditionDto);
        subjectRepository.addSubject(subjectEntity);
        return subjectMapper.convertSubjectEntityToSubjectDisplayDto(subjectEntity);
    }
}
