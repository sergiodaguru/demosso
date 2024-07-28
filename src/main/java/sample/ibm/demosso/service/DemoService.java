package sample.ibm.demosso.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String process() {
        return "test2";
    }

    public String home() {
        return "index.html";
    }
}
