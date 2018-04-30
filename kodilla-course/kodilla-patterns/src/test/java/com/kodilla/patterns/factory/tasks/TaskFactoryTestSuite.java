package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //When
        String shoppingTaskName = shopping.getTaskName();
        shopping.executeTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("Weekend shopping", shoppingTaskName);
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //When
        String paintingTaskName = painting.getTaskName();
        //Then
        Assert.assertEquals(false, painting.isTaskExecuted());
        Assert.assertEquals("Bedroom renovation", paintingTaskName);
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //When
        String paintingTaskName = driving.getTaskName();
        driving.executeTask();
        //Then
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals("Standard night route", paintingTaskName);
    }

    @Test
    public void testFactoryTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task drive = factory.makeTask("driving");
        //When

        //Then
        Assert.assertEquals(null, drive);
    }
}
