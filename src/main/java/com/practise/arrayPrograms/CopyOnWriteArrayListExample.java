package com.practise.arrayPrograms;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {
        List<String> foods = new CopyOnWriteArrayList<>();
        foods.add("Bread");
        foods.add("Jam");
        foods.add("Oregano");

        for (String food : foods){
            System.out.println(food);
            if (food.equals("Jam")){
                foods.add("Butter");
            }
        }

        System.out.println("Updated Food List : " + foods);
    }
}
