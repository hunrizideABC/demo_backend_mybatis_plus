package com.shop.myapp.controller;

import com.shop.myapp.dto.ProjectDTO;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @GetMapping("/findAll")
    public ResponseDTO findAll(){
        ResponseDTO responseDTO = new ResponseDTO();
        List<ProjectDTO> projectDTOList = projectService.list();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(projectDTOList);
        return responseDTO;
    }

    @GetMapping("/getProject/{id}")
    public ResponseDTO getProject(@PathVariable("id") long id){
        ResponseDTO responseDTO = new ResponseDTO();
        ProjectDTO projectDTO = projectService.getById(id);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(projectDTO);
        return responseDTO;
    }

    @GetMapping("/delete/{id}")
    public ResponseDTO delete(@PathVariable("id") long id){
        ResponseDTO responseDTO = new ResponseDTO();
        boolean res = projectService.removeById(id);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @PostMapping("/insert")
    public ResponseDTO insert(@RequestBody ProjectDTO projectDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        boolean res = projectService.save(projectDTO);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }


    @PostMapping("/update")
    public ResponseDTO update(@RequestBody ProjectDTO projectDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        boolean res = projectService.updateById(projectDTO);
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

}
