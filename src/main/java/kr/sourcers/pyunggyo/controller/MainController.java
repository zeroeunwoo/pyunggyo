package kr.sourcers.pyunggyo.controller;

import kr.sourcers.pyunggyo.dto.Exms_damoa_lecture_dto;
import kr.sourcers.pyunggyo.entity.Exms_damoa_lecture_entity;
import kr.sourcers.pyunggyo.repository.Exms_damoa_lecture_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private Exms_damoa_lecture_repository exms_damoa_lecture_repository;

    @PostMapping("/pyunggyo")
    public String Index(@RequestBody Exms_damoa_lecture_dto exms_damoa_lecture_dto) {
        if(exms_damoa_lecture_dto.getAction_flag() == null || exms_damoa_lecture_dto.getAction_flag().equals(""))
            return "PARAM DATA NULL";

        switch (exms_damoa_lecture_dto.getAction_flag().toUpperCase()) {
            case "I" :
                System.out.println("INSERT");
                Insert(exms_damoa_lecture_dto);
                break;
            case "U" :
                System.out.println("UPDATE");
                break;
            case "D" :
                System.out.println("DELETE");
                break;
            default:
                break;
        }

        return "";
    }

    public void Insert(Exms_damoa_lecture_dto exms_damoa_lecture_dto) {
    }
}
