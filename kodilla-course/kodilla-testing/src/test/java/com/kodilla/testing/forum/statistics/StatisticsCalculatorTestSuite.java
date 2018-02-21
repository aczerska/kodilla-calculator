package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatisticsUsersCountMin() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double usersCount = statisticsCalculator.getUsersCount();
        // Then
        Assert.assertEquals(0,usersCount,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsUsersCountMax() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int n = 0; n < 100; n++) {
            usersNames.add("DummyName");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double usersCount = statisticsCalculator.getUsersCount();
        // Then
        Assert.assertEquals(100,usersCount,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsPostsCountMin() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double postsCount = statisticsCalculator.getPostsCount();
        // Then
        Assert.assertEquals(0,postsCount,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsPostsCountMax() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double postsCount = statisticsCalculator.getPostsCount();
        // Then
        Assert.assertEquals(1000,postsCount,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsCountMin() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double postsCount = statisticsCalculator.getCommentsCount();
        // Then
        Assert.assertEquals(0,postsCount,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsMinValues() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double averageCommentCountPerPost = statisticsCalculator.getAverageCommentCountPerPost();
        double averagePostCountPerUser = statisticsCalculator.getAveragePostCountPerUser();
        double averageCommentCountPerUser = statisticsCalculator.getAverageCommentCountPerUser();
        // Then
        Assert.assertEquals(0, averageCommentCountPerPost,0.1);
        Assert.assertEquals(0, averageCommentCountPerUser,0.1);
        Assert.assertEquals(0, averagePostCountPerUser,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsPostsMoreThanComments() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int n = 0; n < 100; n++) {
            usersNames.add("DummyName");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(100);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double averageCommentCountPerPost = statisticsCalculator.getAverageCommentCountPerPost();
        // Then
        Assert.assertEquals(0.01, averageCommentCountPerPost,0.1);
    }
    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int n = 0; n < 100; n++) {
            usersNames.add("DummyName");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        double averageCommentCountPerPost = statisticsCalculator.getAverageCommentCountPerPost();
        // Then
        Assert.assertEquals(10, averageCommentCountPerPost,0.1);
    }
}
