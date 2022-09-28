package pl.tim3erland.tutoriials.sleuth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class TestSecondController {

    private final RestTemplate restTemplate;

    public TestSecondController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/send")
    public void testSecondMethod(@RequestParam(value = "value", required = false, defaultValue = "defaultValue") String value) {
        log.info("testMethod with value: {}", value);
        restTemplate.getForEntity("http://localhost:8080/test?value={}", Void.class, value);
    }
}
