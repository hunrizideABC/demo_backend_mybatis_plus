package com.shop.myapp.controller;

import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    DeveloperService developerService;

    //localhost:8095/developer/findAll
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseDTO findAll() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("all_success");
        responseDTO.setRes(developerService.list());
        return responseDTO;
    }

    @RequestMapping(value = "/getDeveloper/{id}", method = RequestMethod.GET)
    public ResponseDTO getDeveloper(@PathVariable Long id) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("get_success");
        responseDTO.setRes(developerService.getById(id));
        return responseDTO;
    }

    @RequestMapping(value = "/deleteDeveloper/{id}", method = RequestMethod.GET)
    public ResponseDTO deleteDeveloper(@PathVariable Long id) {
        boolean res = developerService.removeById(id);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @PostMapping("/insert")
    public ResponseDTO insert(@RequestBody DeveloperDTO developerDTO) {
        boolean res = developerService.save(developerDTO);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

    @PostMapping("/update")
    public ResponseDTO update(@RequestBody DeveloperDTO developerDTO) {
        boolean res = developerService.updateById(developerDTO);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("OK");
        responseDTO.setRes(res);
        return responseDTO;
    }

}
