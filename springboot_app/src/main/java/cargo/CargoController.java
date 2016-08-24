package cargo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CargoController {

    @RequestMapping("/")
    public String index() {
        return "Cargo SpringBoot";
    }

}