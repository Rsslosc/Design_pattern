package ObserverPattern_RSS;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Rss rssDate = new RssDate();
        ReadUser01 readUser01 = new ReadUser01(rssDate, "User01");
        ReadUser02 readUser02 = new ReadUser02(rssDate, "User02");
        
        ((RssDate)rssDate).setMassage("massage1 is mine!!!", new Date(), "PublicName1 is mine!!");
        ((RssDate)rssDate).setMassage("massage2 is mine!!!", new Date(), "PublicName2 is mine!!");

    }
}
