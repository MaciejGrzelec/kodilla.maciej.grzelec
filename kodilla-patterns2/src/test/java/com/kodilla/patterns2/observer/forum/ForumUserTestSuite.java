package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John smith");
        ForumUser johnSmith2 = new ForumUser("John smith2");
        ForumUser johnSmith3 = new ForumUser("John smith3");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(johnSmith3);
        javaToolsForum.registerObserver(johnSmith2);
        javaToolsForum.registerObserver(johnSmith3);
        //When
        javaHelpForum.addPost("post1");
        javaHelpForum.addPost("post2");
        javaHelpForum.addPost("post3");
        javaToolsForum.addPost("post4");
        javaToolsForum.addPost("post5");
        //Then
        Assert.assertEquals(3, johnSmith.getUpdateCount());
        Assert.assertEquals(2, johnSmith2.getUpdateCount());
        Assert.assertEquals(5, johnSmith3.getUpdateCount());
    }

}
