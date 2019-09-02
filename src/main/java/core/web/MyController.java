package core.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {


    @GetMapping("/hello1")
    public String hello1() {

        try {
            Thread.sleep(300);
        } catch (Exception e) {

        }

        System.out.println(Thread.currentThread().getName());

        return "William";
    }
}
