package gent.zeus.tappb.entity;

public class TapUser {
    private int id;
    private String profilePictureURL;
    private Product favoriteItem;

    public TapUser(int id, String profilePictureURL, Product favoriteItem) {
        this.id = id;
        this.profilePictureURL = profilePictureURL;
        this.favoriteItem = favoriteItem;
    }

    public int getId() {
        return id;
    }

    public String getProfilePictureURL() {
        return profilePictureURL;
    }

    public Product getFavoriteItem() {
        return favoriteItem;
    }
}
