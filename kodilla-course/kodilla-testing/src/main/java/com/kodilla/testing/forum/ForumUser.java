package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {

    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        // do nothing
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        // do nothing
    }

    public int getPostsQuantity() {
        return 100; // return 100 temp
    }

    public int getCommentsQuantity() {
        return 100; // return 100 temp
    }

    public ForumPost getPost(int PostNumber) {
        // returning null means that the operation was unsuccessful
        return null;
    }

    public ForumComment getComment(int commentNumber) {
        // returning null means that the operation was unsuccessful
        return null;
    }

    public boolean removePost(ForumPost thePost) {
        // return true temp
        return true;
    }

    public boolean removeComment(ForumComment theComment) {
        // return true temp
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}