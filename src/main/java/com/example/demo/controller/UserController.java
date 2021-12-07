package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/mysocialnetwork/user")
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {

    public static final HashMap<Integer, List<User>> USER_LIST_HASH_MAP= new HashMap<>();
    public static final HashMap<Integer, List<Movie>> MOVIE_LIST_HASH_MAP = new HashMap<>();

    // define user
    public static final User user1 = new User(1);
    public static final User user2 = new User(2);
    public static final User user3 = new User(3);
    public static final User user4 = new User(4);
    public static final User user5 = new User(5);
    public static final User user6 = new User(6);

    // define movie
    public static final Movie movie1 = new Movie("1");
    public static final Movie movie2 = new Movie("2");
    public static final Movie movie3 = new Movie("3");
    public static final Movie movie4 = new Movie("4");
    public static final Movie movie5 = new Movie("5");
    public static final Movie movie6 = new Movie("6");

    static {
        // define friendship
        USER_LIST_HASH_MAP.put(1, List.of(user2, user4));
        USER_LIST_HASH_MAP.put(2, List.of(user1, user3, user4));
        USER_LIST_HASH_MAP.put(3, List.of(user1, user2));
        USER_LIST_HASH_MAP.put(4, List.of(user1, user2));
        USER_LIST_HASH_MAP.put(5, List.of(user6));
        USER_LIST_HASH_MAP.put(6, List.of(user5));

        // define movie
        MOVIE_LIST_HASH_MAP.put(1, List.of(movie1, movie2, movie3));
        MOVIE_LIST_HASH_MAP.put(2, List.of(movie3, movie4, movie5));
        MOVIE_LIST_HASH_MAP.put(3, List.of(movie3, movie5));
        MOVIE_LIST_HASH_MAP.put(4, List.of(movie3, movie4, movie5));
        MOVIE_LIST_HASH_MAP.put(5, List.of(movie6, movie2));
        MOVIE_LIST_HASH_MAP.put(6, List.of(movie1, movie2));
    }

    @GetMapping("/{id}/friends")
    @ResponseBody
    public List<User> getUserFriendsById(@PathVariable Integer id) {
        return USER_LIST_HASH_MAP.getOrDefault(id, List.of());
    }

    @GetMapping("/{id}/movies")
    @ResponseBody
    public List<Movie> getMoviesById(@PathVariable Integer id) {
        return MOVIE_LIST_HASH_MAP.getOrDefault(id, List.of());
    }

}
