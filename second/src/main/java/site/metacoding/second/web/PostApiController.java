package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApiController {

    // SELECT * FROM post WHERE id = ?
    // 구체적으로 뭘 달라고 요청해야함 - body X
    @GetMapping("/post/{id}")
    public String test1(@PathVariable int id) {
        return "주세요 : id : " + id;
    }

    // SELECT * FROM post WHERE title = ? (제목은 동일한게 있을 수 있다, pk가 아닌 것)
    // 구체적으로 뭘 달라고 요청해야함 - body X
    // http://localhost:8000/post?title=? 와 같다
    @GetMapping("/post")
    public String search(String title) {

        // String title = request.getParameter("title"); 이런 방식인데 훨씬 쉽구나
        return "주세요 : title : " + title;
    }

    // http://localhost:8000/post
    // body : title=제목1&content=내용1
    // header : Content-Type : application/x-www-form-urlencoded 란다~
    // request.getParameter() 메서드가 스프링 기본 파싱 전략
    // 뭘 줘야 함 - body O
    @PostMapping("/post")
    public String test2(String title, String content) {
        return "줄게요 : title : " + title + ", content : " + content;
    }

    // UPDATE post SET title = ?, content = ? WHERE id =?
    // title, content (+ primary key : id) ~ id를 찾아서(주소에 붙임)
    // 뭘 줘야 함 - body O
    // 다른 사람들과 협업할 때 API 문서를 작성해서 넘겨줘야 한다
    @PutMapping("/post/{id}")
    public String test3(String title, String content, @PathVariable int id) {
        return "수정해주세요 : title : " + title + ", content : " + content + ", id : " + id;
    }

    // DELETE from post WHERE id = ?
    // PK구체적으로 삭제해주세요 - body X
    @DeleteMapping("/post/{id}")
    public String test4(String title, String content, @PathVariable int id) {
        return "삭제해주세요 : title : " + title + ", content : " + content + ", id : " + id;
    }
}
