package net.rafaeltoledo.dagger.data.domain;

public class User {

    private final String displayName;
    private final UserLinks links;

    public User(String displayName, UserLinks links) {
        this.displayName = displayName;
        this.links = links;
    }

    public String getDisplayName() {
        return displayName;
    }

    public UserLinks getLinks() {
        return links;
    }
}
