package com.example.jpa.notice.controller;

import com.example.jpa.notice.model.NoticeModel;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiNoticeController {

//@GetMapping("/api/notice")
//    public String noticeString(){
//        return "공지사항입니다.";
//    }

//    @GetMapping("/api/notice")
//    public NoticeModel notice(){
//
//        LocalDateTime regDate = LocalDateTime.of(2024,05,23,13,25,45);
//
//        NoticeModel noticeModel = new NoticeModel();
//        noticeModel.setId(1);
//        noticeModel.setTitle("공지사항입니다.");
//        noticeModel.setContents("내용입니다.");
//        noticeModel.setRegDate(regDate);
//
//        return noticeModel();
//
//    }
//    @GetMapping("/api/notice")
//    public List<NoticeModel> notice(){
//
//        List<NoticeModel> noticeList = new ArrayList<>();
//
//        noticeList.add(NoticeModel.builder()
//                .id(1)
//                .title("공지사항입니다.")
//                .contents("공지사항내용입니다.")
//                .regDate(LocalDateTime.of(2024,06,20,13,20,45))
//                .build());
//
//
//        noticeList.add(NoticeModel.builder()
//                .id(2)
//                .title("공지사항22입니다.")
//                .contents("공지사항내용22입니다.")
//                .regDate(LocalDateTime.of(2024,06,20,13,20,45))
//                .build()
//        );
//
//        return noticeList;
//
//    }
    @GetMapping("/api/notice")
    public List<NoticeModel> notice(){
        List<NoticeModel> noticeList = new ArrayList<>();
        return noticeList;

    }

    @GetMapping("/api/notice/count")
    public int noticeCount(){
        return 10;
    }

    //    @PostMapping("/api/notice")
//    public NoticeModel addNotice(@RequestParam String title, @RequestParam String contents){
//        NoticeModel notice = new NoticeModel();
//        notice.setId(1);
//        notice.setTitle(title);
//        notice.setContents(contents);
//        notice.setRegDate(LocalDateTime.of(2024,06,20,15,22,30));
//            return notice;
//    }
//    @PostMapping("/api/notice")
//    public NoticeModel addNotice(NoticeModel noticeModel){
//
//        noticeModel.setId(2);
//        noticeModel.setRegDate(LocalDateTime.now());
//
//        return noticeModel;
//
//    }
    @PostMapping("/api/notice")
    public NoticeModel addNotice(@RequestBody NoticeModel noticeModel) {

            noticeModel.setId(3);
            noticeModel.setRegDate(LocalDateTime.now());

            return noticeModel;
    }
}
