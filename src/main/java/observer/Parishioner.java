package observer;

public class Parishioner {

    private String name;

    public Parishioner(String name, Church church) {
        this.name = name;
        church.registerParishioner(this);
    }

    void update(String newsChurch) {
        System.out.println(name + "узнал новость: " + newsChurch);
    }
}