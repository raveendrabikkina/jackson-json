package com.ravi.jacksonjson.test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ravi.jacksonjson.beans.Developer;
import com.ravi.jacksonjson.beans.Tester;
import com.ravi.jacksonjson.beans.User;
import org.joda.time.LocalDate;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.setTestingTask("Testing...");
        Developer developer = new Developer();
        developer.setDeveloperTask("Coding...");

        List<User> roles = new ArrayList<>();
        roles.add(tester);
        roles.add(developer);

        User user = new User(1, "Raveendra", "Bikkina", LocalDate.now(), roles, new BigDecimal(100000));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String userJson = mapper.writeValueAsString(user);
            System.out.println("Serialized:\n" + userJson);
            try {
                User user1 = mapper.readValue(userJson, User.class);
                System.out.println("Deserialized:\n" + user1);
                System.out.println(user1.getRoles().get(0).getClass().getName());
                System.out.println(user1.getRoles().get(1).getClass().getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
