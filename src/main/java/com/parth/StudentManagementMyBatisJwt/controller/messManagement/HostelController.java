package com.parth.StudentManagementMyBatisJwt.controller.messManagement;

import com.parth.StudentManagementMyBatisJwt.dto.messManagement.HostelAdditionDto;
import com.parth.StudentManagementMyBatisJwt.dto.messManagement.HostelDisplayDto;
import com.parth.StudentManagementMyBatisJwt.services.messManagement.HostelService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RolesAllowed({"MESS_OWNER","OFFICE_ADMIN"})
@RequestMapping("/hostels")
public class HostelController {

    @Autowired
    HostelService hostelService;

    @GetMapping
    public List<HostelDisplayDto> findAllHostels(){return hostelService.getAllHostel();}

    @PostMapping
    public HostelDisplayDto addHostel(@RequestBody HostelAdditionDto hostelAdditionDto){
        return hostelService.addHostel(hostelAdditionDto);
    }
}
