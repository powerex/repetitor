package ua.azbest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.azbest.domain.User;
import ua.azbest.repositories.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        userRepository.deleteAll();
//
//        userRepository.save(new User("Yurii", 33));
//        userRepository.save(new User("Ivka", 30));
//        userRepository.save(new User("Srachka", 30));
//
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (User user : userRepository.findAll()) {
//            System.out.println(user);
//        }
//        System.out.println();


    }
}
