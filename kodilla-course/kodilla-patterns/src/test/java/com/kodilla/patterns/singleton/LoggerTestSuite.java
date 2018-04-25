package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {

    @Test
    public void testGetLastlog() {
        //Given
        Logger logger = new Logger();
        logger.log("This is TEST!");
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals(lastLog, "This is TEST!");
    }
}
