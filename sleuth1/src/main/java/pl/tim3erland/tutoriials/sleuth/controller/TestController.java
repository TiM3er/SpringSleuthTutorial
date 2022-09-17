package pl.tim3erland.tutoriials.sleuth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/test")
    public void testMethod(@RequestParam(value = "value", required = false, defaultValue = "defaultValue") String value) {
        log.info("testMethod with value: {}", value);
    }
}
