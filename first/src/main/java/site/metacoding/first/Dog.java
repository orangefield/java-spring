package site.metacoding.first;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class Dog {
    private String name = "푸들";

    public Dog() {
        System.out.println("강아지가 IoC 컨테이너에 등록되었어요");
    }
}
