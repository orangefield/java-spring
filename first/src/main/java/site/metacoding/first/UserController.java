package site.metacoding.first;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Data를 리턴하는 컨트롤러(printWrite)
@RestController
public class UserController {

    Dog d; // 컴포지션. 얘는 유저컨트롤러가 아님

    // DI라고 함. IoC 컨테이너에 있으니까 주입해 줄 수 있음
    // Dependency Injection 의존성 주입(IoC 컨테이너로부터)
    public UserController(Dog d) {
        System.out.println("UserController 생성자 실행됨");
        this.d = d;
    }

    @GetMapping("/home")
    public void home() {
        System.out.println("home~~~~~~~~~~~~~~~~~~~");
    }

    @GetMapping("/bye")
    public void bye() {
        System.out.println("bye~~~~~~~~~~~~~~~~~~~");
    }

    @GetMapping("/data")
    public String data() {
        return "data";
    }
}
