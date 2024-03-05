package observer;

import java.util.ArrayList;
import java.util.List;

public class CatholicChurch implements Church {
    private List<Parishioner> parishioners;
    private String newsChurch;

    public CatholicChurch() {
        parishioners = new ArrayList<>();
    }

    public void setNewsChurch(String news) {
        this.newsChurch = news;
        notifyParishioners();
    }

    @Override
    public void registerParishioner(Parishioner parishioner) {
        parishioners.add(parishioner);
    }

    @Override
    public void removeParishioner(Parishioner parishioner) {
        parishioners.remove(parishioner);
    }

    @Override
    public void notifyParishioners() {
        for (Parishioner parishioner : parishioners)
            parishioner.update(newsChurch);
    }
}