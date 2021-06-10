package classes;

import java.util.List;

public class Application {

    private List<Websites> websites;
    private Amazon amazon;
    private Rozetka rozetka;

    public Amazon getAmazon() {
        return amazon;
    }

    public void setAmazon(Amazon amazon) {
        this.amazon = amazon;
    }

    public Rozetka getRozetka() {
        return rozetka;
    }

    public void setRozetka(Rozetka rozetka) {
        this.rozetka = rozetka;
    }

    public List<Websites> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Websites> websites) {
        this.websites = websites;
    }
}
