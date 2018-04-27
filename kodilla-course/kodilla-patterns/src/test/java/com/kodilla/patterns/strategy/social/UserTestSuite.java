package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jake = new Millenials("Jake");
        User nixon = new YGeneration("Nixon");
        User sun = new ZGeneration("Sun");

        //When
        String jakeSharing = jake.sharePost();
        System.out.println(jakeSharing);
        String nixonSharing = nixon.sharePost();
        System.out.println(nixonSharing);
        String sunSharing = sun.sharePost();
        System.out.println(sunSharing);

        //Then
        Assert.assertEquals("Share it with Twitter", jakeSharing);
        Assert.assertEquals("Share it with Facebook", nixonSharing);
        Assert.assertEquals("Share it with Snapchat", sunSharing);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jake = new Millenials("Jake");

        //When
        String jakeSharing = jake.sharePost();
        System.out.println(jakeSharing);
        jake.setSocialPublisher(new SnapchatPublisher());
        jakeSharing = jake.sharePost();
        System.out.println(jakeSharing);

        //Then
        Assert.assertEquals("Share it with Snapchat",jakeSharing);



    }
}
