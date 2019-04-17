package app;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="data", defaultValue="0") int[] data) {
        return new Greeting(data);
    }
}
