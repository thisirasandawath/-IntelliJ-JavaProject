package Contraller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/welcome" )
    public String welcome()
    {
        return "Hello world!!! get";
    }
}
