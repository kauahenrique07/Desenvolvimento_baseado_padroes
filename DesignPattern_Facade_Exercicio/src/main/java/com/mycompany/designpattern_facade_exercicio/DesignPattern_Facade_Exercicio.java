package com.mycompany.designpattern_facade_exercicio;

public class DesignPattern_Facade_Exercicio {

    public static void main(String[] args) {
        TwitterAPIFacade twitterFacade = new TwitterAPIFacade();
        String[] recentTweets = twitterFacade.getRecentTweets();
        // Exibe os tweets recentes
        for (String tweet : recentTweets) {
            System.out.println(tweet);
        }
    }
}
