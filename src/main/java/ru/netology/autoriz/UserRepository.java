package ru.netology.autoriz;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    //Решение не самое красивое, но я так и не понял задачу, что хотел получить автор,
    // там почему-то написано, что метод должен вернуть массив, при этом метод в коде указано возвращает List'ы
    private ConcurrentHashMap<String, String> users = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, List<Authorities>> authorities = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        //это было для проверок
        //users.put("dim","4324");
        //authorities.put("dim", new ArrayList<>());
        if (users.get(user).equals(password)) {
            return authorities.get(user);
        } else return Collections.emptyList();
    }
}