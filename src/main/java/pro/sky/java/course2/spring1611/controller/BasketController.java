package pro.sky.java.course2.spring1611.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.spring1611.service.BasketService;

import java.util.List;

@RestController
public class BasketController {
    @Autowired
    private BasketService basketService;

    @GetMapping("/store/order/get")
    public List<Integer> get(){
        return basketService.get();
    }

    @GetMapping("/store/order/add")
    public void add(@RequestParam List<Integer> item) {
        item.forEach(i-> basketService.add(i));
    }

}
