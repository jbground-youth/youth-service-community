package com.jbground.community.event.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class EventController {

    @GetMapping(value = "/notices")
    public void test(){

    }

    /**
     * event 단건 조회 by id
     */
    @GetMapping(value = "/notices/{id}")
    public void noticeById(@PathVariable String id){

    }

    /**
     * event 추가 및 수정
     * @param id
     */
    @PostMapping(value = "/notices/{id}")
    public void postNoticeById(@PathVariable String id){

    }


}


