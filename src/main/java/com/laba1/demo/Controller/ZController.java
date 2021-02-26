package com.laba1.demo.Controller;


import com.laba1.demo.Service.ZService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZController {
    @GetMapping("/calculation")
    public ZService Calculattion
            (
                    @RequestParam(name="x1")int weight1,
                    @RequestParam(name="y1")int speed1,
                    @RequestParam(name="x2")int weight2,
                    @RequestParam(name="y2")int speed2
            )
    {
        return new ZService(speed1,weight1,speed2,weight2);
    }
}
