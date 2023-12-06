package com.mycompany.designpattern_facade_exercicio;

public class TwitterAPIFacade {

    private RequestToken requestToken = new RequestToken();
    private AccessToken accessToken = new AccessToken();
    private TweetFetcher tweetFetcher = new TweetFetcher();

    public String[] getRecentTweets() {
        String reqToken = requestToken.getRequestToken();
        String accToken = accessToken.getAccessToken(reqToken);
        return tweetFetcher.getTweets(accToken);
    }

}
