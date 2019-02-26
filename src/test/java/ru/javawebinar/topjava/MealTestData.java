package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import static ru.javawebinar.topjava.model.AbstractBaseEntity.START_SEQ;

public class MealTestData {

    public static final int MEAL1_ID = START_SEQ;
    public static final int ADMIN_MEAL_ID = START_SEQ + 1;

    public static final Meal MEAL3 = new Meal(MEAL1_ID, LocalDateTime.of(2018, Month.DECEMBER, 31, 7, 34, 56), "Завтрак", 550);
    public static final Meal MEAL1 = new Meal(MEAL1_ID, LocalDateTime.of(2018, Month.DECEMBER, 31, 12, 34, 56), "Обед", 1050);
    public static final Meal MEAL2 = new Meal(MEAL1_ID, LocalDateTime.of(2018, Month.DECEMBER, 31, 18, 34, 56), "Ужин", 500);
    public static final Meal MEAL4 = new Meal(MEAL1_ID, LocalDateTime.of(2018, Month.DECEMBER, 30, 6, 55, 55), "Завтрак", 550);
    public static final Meal MEAL5 = new Meal(MEAL1_ID, LocalDateTime.of(2018, Month.DECEMBER, 30, 13, 34, 23), "Обед", 550);
    public static final Meal MEAL6 = new Meal(MEAL1_ID, LocalDateTime.of(2018, Month.DECEMBER, 30, 18, 22, 23), "Ужин", 450);
    public static final Meal ADMIN_MEAL1 = new Meal(ADMIN_MEAL_ID, LocalDateTime.of(2018, Month.DECEMBER, 30, 9, 22, 23), "Админ_ланч", 950);
    public static final Meal ADMIN_MEAL2 = new Meal(ADMIN_MEAL_ID, LocalDateTime.of(2018, Month.DECEMBER, 30, 11, 22, 23), "Админ_бранч", 1150);
}
