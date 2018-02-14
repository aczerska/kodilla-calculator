package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        // When
        forumUser.addPost("mrsmith", "Hello everyone, this is my first post here!");
        // Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first post here!", "mrsmith");
        // When
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");
        // Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    // Testing if post we got from ForumUser class is the same as the one we put in there
    public void testGetPost() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone ," + "this is my first post here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        // When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        // Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    // Testing if comment we got from ForumUser class is the same as the one we put in there
    public void testGetComment() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone ," + "this is my first post here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        // When
        ForumComment retrievedComment = forumUser.getComment(0);
        // Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    // Testing if attempt to remove nonexistent post will result in receiving false
    public void testRemovePostNotExisting() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone ," + "this is my first post here!", "mrsmith");
        // When
        boolean result = forumUser.removePost(thePost);
        // Then
        Assert.assertFalse(result);
    }

    @Test
    // Testing if attempt to remove nonexistent comment will result in receiving false
    public void testRemoveCommentNotExisting() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone ," + "this is my first post here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        // When
        boolean result = forumUser.removeComment(theComment);
        // Then
        Assert.assertFalse(result);
    }

    @Test
    // Testing if managed to remove chosen post from class
    public void testRemovePost() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone ," + "this is my first post here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        // When
        boolean result = forumUser.removePost(thePost);
        // Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    // Testing if managed to remove chosen comment from class
    public void testRemoveComment() {
        // Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone ," + "this is my first post here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        // When
        boolean result = forumUser.removeComment(theComment);
        // Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}