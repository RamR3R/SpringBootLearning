package com.example.demo.User;

import java.time.LocalDate;
import java.util.List;

public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "Ram",
                        "sendtoramsundar@gmail.com",
                        25,
                        LocalDate.of(1998,10,30)
                ));
    }
}
