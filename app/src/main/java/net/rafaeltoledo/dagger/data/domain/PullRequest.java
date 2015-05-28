package net.rafaeltoledo.dagger.data.domain;

public class PullRequest {

    private final String body;
    private final User user;
    private final String title;

    public PullRequest(String body, User user, String title) {
        this.body = body;
        this.user = user;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public User getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }
}
