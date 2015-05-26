package net.rafaeltoledo.dagger.data.domain;

public class UserLinks {

    private final Link self;
    private final Link html;
    private final Link avatar;

    public UserLinks(Link self, Link html, Link avatar) {
        this.self = self;
        this.html = html;
        this.avatar = avatar;
    }

    public Link getSelf() {
        return self;
    }

    public Link getHtml() {
        return html;
    }

    public Link getAvatar() {
        return avatar;
    }
}
