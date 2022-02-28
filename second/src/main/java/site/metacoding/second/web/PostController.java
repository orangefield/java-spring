package site.metacoding.second.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import site.metacoding.second.domain.Post;

@Controller
public class PostController {
    // View (글 쓰기 페이지, 글 목록 페이지, 글 상세보기 페이지) - 전부 GET

    @GetMapping("/post/writeForm")
    public String writeForm() {

        return "post/writeForm";
    }

    @GetMapping("/post/list")
    public String list(Model model) {
        List<Post> posts = new ArrayList<>();
        Post post1 = new Post(1, "제목1", "내용1");
        Post post2 = new Post(2, "제목2", "내용2");
        Post post3 = new Post(3, "제목3", "내용3");
        Post post4 = new Post(4, "제목4", "내용4");
        Post post5 = new Post(5, "제목5", "내용5");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);

        model.addAttribute("posts", posts);

        return "post/list";
    }

    @GetMapping("/post/detail")
    public String detail(Model model) {
        // 1. db에 연결해서 SELECT 해야한다.
        // 2.ResultSet을 JavaObjsect로 변경해야한다.
        Post post = new Post(1, "제목1", "내용1");
        // 3.Request 에 담아주기.
        model.addAttribute("post", post);

        return "post/detail"; // RequestDispathcher 로 forward한다 = request 가 복제된다.
    }

}