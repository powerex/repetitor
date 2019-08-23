package ua.azbest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class User {

    @Id
    private String id;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;



}
