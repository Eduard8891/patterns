package observer;

public interface Church {
    void registerParishioner(Parishioner parishioner);
    void removeParishioner(Parishioner parishioner);
    void notifyParishioners();
}