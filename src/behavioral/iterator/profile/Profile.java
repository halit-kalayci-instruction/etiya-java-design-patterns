package behavioral.iterator.profile;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String name;
    private String email;
    public List<String> contacts = new ArrayList<>();

    public Profile(String name, String email, String... contacts) {
        this.name = name;
        this.email = email;

        for(String contact: contacts){
            if(this.contacts != null)
                this.contacts.add(contact);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
