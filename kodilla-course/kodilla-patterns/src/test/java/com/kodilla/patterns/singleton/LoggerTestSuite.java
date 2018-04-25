package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {

    @Test
    public void testGetLastlog() {
        //Given
        Logger.getInstance().log("This is TEST!");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(lastLog, "This is TEST!");
    }
}
