package com.practise.optional;

import java.util.Optional;

public class OptionalUse {

    public static void main(String[] args) {
        String str = "abc";

        Optional<String> optional = Optional.ofNullable(str);

        if (optional.isPresent()) {
            System.out.println("Value is : " + optional.get());
        } else {
            String defaultStr = optional.orElse("Default");
            System.out.println("Value is not present");
            System.out.println("Default String : " + defaultStr);
        }
    }
}
