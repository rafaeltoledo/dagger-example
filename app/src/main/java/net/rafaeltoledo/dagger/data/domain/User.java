package net.rafaeltoledo.dagger.data.domain;

public class User {

    private final String displayName;

    public User(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
