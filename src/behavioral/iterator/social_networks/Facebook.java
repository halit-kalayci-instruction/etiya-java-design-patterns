package behavioral.iterator.social_networks;

import behavioral.iterator.iterators.FacebookIterator;
import behavioral.iterator.iterators.ProfileIterator;
import behavioral.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork{
    private List<Profile> profiles;

    public Facebook(List<Profile> profiles) {
        if(profiles != null)
            this.profiles = profiles;
        else
            profiles = new ArrayList<>();
    }

    public Profile requestProfileFromFacebook(String email){
        System.out.println("Facebook: loading profile for: " + email);
        return findProfile(email);
    }

    public List<String> requestProfileFriendsFromFacebook(String email){
        Profile profile = findProfile(email);
        if(profile != null){
            return profile.contacts;
        }
        return null;
    }


    private Profile findProfile(String email){
        for(Profile profile: profiles){
            if(profile.getEmail().equalsIgnoreCase(email))
                return profile;
        }
        return null;
    }


    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this,profileEmail);
    }

}
