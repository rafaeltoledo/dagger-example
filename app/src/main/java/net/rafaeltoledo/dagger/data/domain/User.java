package net.rafaeltoledo.dagger.data.domain;

public class User {

    private final String login;
    private final String avatarUrl;

    public User(String login, String avatarUrl) {
        this.login = login;
        this.avatarUrl = avatarUrl;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
}
