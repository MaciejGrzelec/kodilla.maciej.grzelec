package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avPostsPerUser;
    private double avCommentsPerUser;
    private double avCommentsPerPost;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {
        if ((statistics.usersNames().size() == 0)
                || (statistics.postsCount() == 0 && statistics.commentsCount() > 0)) {
            System.out.println("Forum Data Error. 0 users of Forum, or 0 post and any comments");
        } else {
            numberOfUsers = statistics.usersNames().size();
            numberOfPosts = statistics.postsCount();
            numberOfComments = statistics.commentsCount();
            avPostsPerUser = numberOfPosts / numberOfUsers;
            avCommentsPerUser = numberOfComments / numberOfUsers;
            if (numberOfPosts>0) {
                avCommentsPerPost = numberOfComments / numberOfPosts;
            }
        }
    }

    public void showStatistics(){
        System.out.println("avPostsPerUser: " + avPostsPerUser + ", avCommentsPerUser: " + avCommentsPerUser + ", avCommentsPerPost: " + avCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }
}
