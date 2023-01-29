package pl.michal.wrona.tennisapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TennisController {

    @GetMapping("/test")
    public int test(){
        return 1;
    }
}
