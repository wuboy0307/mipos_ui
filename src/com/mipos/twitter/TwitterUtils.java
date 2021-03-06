package com.mipos.twitter;

import oauth.signpost.OAuth;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.http.AccessToken;
import android.content.SharedPreferences;

public class TwitterUtils {

	public static boolean isAuthenticated(SharedPreferences prefs) {

		String token = prefs.getString(OAuth.OAUTH_TOKEN, "21837466-M2YUNfmbD9tIJmCbOG5TiDGid3zqIje3q7SzDaiQ");
		String secret = prefs.getString(OAuth.OAUTH_TOKEN_SECRET, "EvPOMNsGDiq6uj5uJ9Zzif5u0nzRzVrt9kOb5gKOY");
		
		AccessToken a = new AccessToken(token,secret);
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(TwitterConstants.CONSUMER_KEY, TwitterConstants.CONSUMER_SECRET);
		twitter.setOAuthAccessToken(a);
		
		try {
			twitter.getAccountSettings();
			return true;
		} catch (TwitterException e) {
			return false;
		}
	}
	
	public static void sendTweet(SharedPreferences prefs,String msg) throws Exception {
		String token = prefs.getString(OAuth.OAUTH_TOKEN, "21837466-M2YUNfmbD9tIJmCbOG5TiDGid3zqIje3q7SzDaiQ");
		String secret = prefs.getString(OAuth.OAUTH_TOKEN_SECRET, "EvPOMNsGDiq6uj5uJ9Zzif5u0nzRzVrt9kOb5gKOY");
		
		AccessToken a = new AccessToken(token,secret);
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(TwitterConstants.CONSUMER_KEY, TwitterConstants.CONSUMER_SECRET);
		twitter.setOAuthAccessToken(a);
        twitter.updateStatus(msg);
	}
	
	
}
