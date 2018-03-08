package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser))
                .forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }
}
