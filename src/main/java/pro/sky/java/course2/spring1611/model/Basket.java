package pro.sky.java.course2.spring1611.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private ArrayList<Integer> listGoods = new ArrayList<>();

    public void add(int id){
        listGoods.add(id);
    }

    public List<Integer> get(){
        return listGoods;
    }
}
