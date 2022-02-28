package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    // 줘! Read - SELECT
    @GetMapping("/user") // user 테이블에 있는 전체를 주세요
    public String test1() {
        return "<h1>test1</h1>";
    }

    // 줄게요! Create - INSERT
    @PostMapping("/user")
    public String test2() {
        return "<h1>test2</h1>";
    }

    // 수정해요! Update - UPDATE
    @PutMapping("/user")
    public String test3() {
        return "<h1>test3</h1>";
    }

    // 삭제해요! Delete - DELETE
    @DeleteMapping("/user")
    public String test4() {
        return "<h1>test4</h1>";
    }
}
