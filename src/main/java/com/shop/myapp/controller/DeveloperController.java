package com.shop.myapp.controller;

import com.shop.myapp.dto.DeveloperDTO;
import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    DeveloperService developerService;

    @ResponseBody    //localhost:8095/developer/findAll
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("all_success");
        responseDTO.setRes(developerService.list_all());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/getDevelper/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getDeveloper(@PathVariable Long id) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("get_success");
        responseDTO.setRes(developerService.list_one(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteDevelper/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> deleteDevelper(@PathVariable Long id) {
        boolean res = developerService.delete(id);
        ResponseDTO responseDTO = new ResponseDTO();
        if(res) {
            responseDTO.setResultCode("del_success");
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        }else{
            responseDTO.setResultCode("del_fail");
            return new ResponseEntity<>(responseDTO, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestBody DeveloperDTO developerDTO) {
        boolean res = developerService.create(developerDTO);
        ResponseDTO responseDTO = new ResponseDTO();
        if(res) {
            responseDTO.setResultCode("insert_success");
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        }else{
            responseDTO.setResultCode("insert_fail");
            return new ResponseEntity<>(responseDTO, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody DeveloperDTO developerDTO) {
        boolean res = developerService.update(developerDTO);
        ResponseDTO responseDTO = new ResponseDTO();
        if(res) {
            responseDTO.setResultCode("update_success");
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        }else{
            responseDTO.setResultCode("update_fail");
            return new ResponseEntity<>(responseDTO, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
