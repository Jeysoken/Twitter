package twitter;

import twitter.profile.Twitter;
import twitter.profile.TwitterMeta;
import twitter.profile.TwitterUser;
import twitter.profile.background.CachedTwitterBackground;

public class Profile {

	static TwitterUser user;
	
	public void setTwitterBackground(CachedTwitterBackground backgroundTwitter) {
	}

	public void setTwitterInfo() {
		TwitterUser user = Twitter.getUser(Profile.getUser().getName());
		TwitterMeta userM = user.getTwitterMeta();
		userM.setPrenom("Alexandre");
		userM.setPhisicalType(PhysicalType.BG);
		user.setTwitterMeta(userM);
	}

	private static TwitterUser getUser() {
		return user;
	}
}
