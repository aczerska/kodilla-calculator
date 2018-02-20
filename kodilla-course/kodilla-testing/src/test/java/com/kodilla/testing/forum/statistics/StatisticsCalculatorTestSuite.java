package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatisticsUsersCountMin() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames().size()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        int usersCount = statisticsCalculator.getUsersCount();
        // Then
        Assert.assertEquals(0,usersCount);
    }

    @Test
    public void testCalculateAdvStatisticsUsersCountMax() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames().size()).thenReturn(100);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        int usersCount = statisticsCalculator.getUsersCount();
        // Then
        Assert.assertEquals(100,usersCount);
    }

    @Test
    public void testCalculateAdvStatisticsPostsCountMin() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        int postsCount = statisticsCalculator.getPostsCount();
        // Then
        Assert.assertEquals(0,postsCount);
    }

    @Test
    public void testCalculateAdvStatisticsPostsCountMax() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        int postsCount = statisticsCalculator.getPostsCount();
        // Then
        Assert.assertEquals(1000,postsCount);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsCountMin() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        // When
        int postsCount = statisticsCalculator.getCommentsCount();
        // Then
        Assert.assertEquals(1000,postsCount);
    }

    @Test
    public void testCalculateAdvStatisticsMinValues() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames().size()).thenReturn(0);
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



}
