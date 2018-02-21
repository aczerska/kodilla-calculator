package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
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
        if (postsCount == 0 || usersCount == 0) {
            averageCommentCountPerPost = 0;
            averageCommentCountPerUser = 0;
            averagePostCountPerUser = 0;
        } else if (commentsCount == 0) {
            averageCommentCountPerPost = 0;
            averageCommentCountPerUser = 0;
            averagePostCountPerUser = (double)postsCount / (double)usersCount;
        } else {
            averageCommentCountPerPost = (double)commentsCount / (double)postsCount;
            averageCommentCountPerUser = (double)commentsCount / (double)usersCount;
            averagePostCountPerUser = (double)postsCount / (double)usersCount;
        }
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
