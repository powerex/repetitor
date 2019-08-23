package ua.azbest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ua.azbest.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByName(String name);

}
