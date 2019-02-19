package ru.javawebinar.topjava.repository.inmemory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.service.UserServiceImpl;
import ru.javawebinar.topjava.web.user.AdminRestController;
import ru.javawebinar.topjava.web.user.ProfileRestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class InMemoryUserRepositoryImpl implements UserRepository {
    private static final Logger log = LoggerFactory.getLogger(InMemoryUserRepositoryImpl.class);
    private Map<Integer, User> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        AdminRestController adminRestController = new AdminRestController();
        List<User> adminsList = adminRestController.getAll();
        for (User user : adminsList) {
            save(user);
        }
        ProfileRestController profileRestController = new ProfileRestController();
        List<User> usersList = profileRestController.getAll();
        for (User user : usersList) {
            save(user);
        }
    }

    @Override
    public User save(User user) {
        log.info("save {}", user);
        if(user.isNew()){
            user.setId(counter.incrementAndGet());
            repository.put(user.getId(), user);
            return user;
        }
        return repository.computeIfPresent(user.getId(), (id, oldUser) -> user);
    }

    @Override
    public boolean delete(int id) {
        log.info("delete {}", id);
        if(repository.containsKey(id)) {
            repository.remove(id);
            return true;
        } else
            return false;
    }

    @Override
    public User get(int id) {
        log.info("get {}", id);
        if(repository.containsKey(id)){
            return repository.get(id);
        } else
            return null;
    }

    @Override
    public List<User> getAll() {
        log.info("getAll");
        List<User> users = new ArrayList<>();
        for (User value : repository.values()) {
            users.add(value);
        }
        return users;
    }

    @Override
    public User getByEmail(String email) {
        log.info("getByEmail {}", email);
        return repository.values().stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
    }
}