package behavioral.iterator.iterators;


import behavioral.iterator.profile.Profile;
import behavioral.iterator.social_networks.Facebook;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String email) {
        this.facebook = facebook;
        this.email = email;
    }

    private void loadData(){
        if(emails.size() == 0){
            // facebooktan profilleri getir..
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email);
            for(String profile : profiles){
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        loadData();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if(!hasNext())
            return null;
        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if(friendProfile == null){
            // Facebooktan bu email ile bir profil bul..
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition,friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }
}
