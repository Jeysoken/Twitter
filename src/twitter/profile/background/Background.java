package twitter.profile.background;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import twitter.Profile;
import twitter.profile.Twitter;
import twitter.profile.TwitterProfile;

public class Background extends TwitterProfile {
	
	CachedTwitterBackground backgroundTwitter;
	
	public CachedTwitterBackground onProfileSee(final Profile pr) {
		BufferedImage background;
		try {
			background = ImageIO.read(Twitter.getResource("background.png"));
			CachedTwitterBackground backgroundTwitter = Twitter.loadTwitterBackground(background);
			pr.setTwitterBackground(backgroundTwitter);
			return backgroundTwitter;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return backgroundTwitter;
	}

}










