package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostCountPerUser;
    private double averageCommentCountPerUser;
    private double averageCommentCountPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostCountPerUser() {
        return averagePostCountPerUser;
    }

    public double getAverageCommentCountPerUser() {
        return averageCommentCountPerUser;
    }

    public double getAverageCommentCountPerPost() {
        return averageCommentCountPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersCount = statistics.usersNames().size();
        averageCommentCountPerPost = commentsCount / postsCount;
        averageCommentCountPerUser = commentsCount / usersCount;
        averagePostCountPerUser = postsCount / usersCount;
    }

    public void showStatistics() {
        System.out.println("Number of forum posts: " + postsCount);
        System.out.println("Number of forum comments: " + commentsCount);
        System.out.println("Number of forum users: " + usersCount);
        System.out.println("Average of comments per post: " + averageCommentCountPerPost);
        System.out.println("Average of posts per user: " + averagePostCountPerUser);
        System.out.println("Average of comments per user: " + averageCommentCountPerUser);
    }
}
