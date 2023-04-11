package com.shop.myapp.controller;

import com.shop.myapp.dto.ProjectDTO;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.rmi.PortableRemoteObject;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/findAll")
    public ResponseDTO findAll(){
        List<ProjectDTO> res = projectService.list();
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @GetMapping("/findProject/{id}")
    public ResponseDTO findProject(@PathVariable("id") long id){
        ProjectDTO res = projectService.getById(id);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @GetMapping("/delete/{id}")
    public ResponseDTO delete(@PathVariable("id") long id){
        boolean res = projectService.removeById(id);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }
    @PostMapping("/insert")
    public ResponseDTO insert(@RequestBody ProjectDTO projectDTO){
        boolean res = projectService.save(projectDTO);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @PostMapping("/update")
    public ResponseDTO update(@RequestBody ProjectDTO projectDTO){
        boolean res = projectService.updateById(projectDTO);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }
}
