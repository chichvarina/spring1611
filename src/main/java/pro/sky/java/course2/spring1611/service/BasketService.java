package pro.sky.java.course2.spring1611.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.spring1611.model.Basket;

import java.util.List;

@SessionScope
@Service
public class BasketService {
    Basket basket = new Basket();

    public void add(int id){
        basket.add(id);
    }

    public List<Integer> get(){
        return basket.get();
    }
}
