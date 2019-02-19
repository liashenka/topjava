package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.util.Collection;

public interface MealRepository {
    Meal save(Meal meal);

    void delete(int id);

    Meal get(int id);

//    Collection<Meal> getAll(int userId);
    Collection<Meal> getAll();

    Collection<Meal> getBetween(LocalDateTime startDateTime, LocalDateTime endDateTime, int userId);
}
