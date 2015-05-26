package net.rafaeltoledo.dagger.data.domain;

public class PullRequest {

    private final String description;
    private final User author;
    private final String title;

    public PullRequest(String description, User author, String title) {
        this.description = description;
        this.author = author;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public User getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
