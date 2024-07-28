package sample.ibm.demosso.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sample.ibm.demosso.service.DemoService;

@Controller
@AllArgsConstructor
public class DemoController {

    private DemoService demoService;

    @GetMapping(value = "/")
    public String processRoot() {
        return demoService.home();
    }

    @GetMapping(value = "/test")
    public String process() {
        return demoService.process();
    }
}
