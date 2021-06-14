package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.Controller;
@RestController
public class Restendpoint {

@RequestMapping("/Course")
    public course getEndpoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
                              @RequestParam(value = "counts", defaultValue = "2", required = false) int count) {
        return new course(name,count);
    }
}
