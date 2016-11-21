package bonjour;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BonjourController {

    @RequestMapping("/")
    public String index() {
        return "bonjour";
    }

}
