package com.jbground.community.notice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NoticeController {

    /**
     * notice 전체 조회
     */
    @GetMapping(value = "/notices")
    public void getNotices(){

    }

    /**
     * notice 단건 조회
     */
    @GetMapping(value = "/notices/{id}")
    public void getNoticeById(){

    }

    /**
     * notice 추가 및 수정
     */
    @PostMapping(value = "/notices/{id}")
    public void postNotices(){

    }
}
