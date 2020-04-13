package ObserverPattern_RSS;

public interface Rss {
    void subscribeRss(Reader reader);
    void unsubscribeRss(Reader reader);
    void notifyReader();
}
