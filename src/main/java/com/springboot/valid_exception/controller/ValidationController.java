package com.springboot.valid_exception.controller;

import com.springboot.valid_exception.data.dto.ValidRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/validation")
public class ValidationController {

    private final Logger LOGGER= LoggerFactory.getLogger(ValidationController.class);

    @PostMapping("/valid")
    public ResponseEntity<String> checkValidationByValid(
            @Valid @RequestBody ValidRequestDto validRequestDto){
            LOGGER.info(validRequestDto.toString());
            return ResponseEntity.status(HttpStatus.OK).body(validRequestDto.toString());
    }
    /*Swagger Ui 를 통해 ValidRequestDto 를 RequestBody 로 넘겨 dto 객체 내에서 유효성 검사를
    * 실시하는 메서드*/
}