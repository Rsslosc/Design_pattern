package ObserverPattern_RSS;

import java.util.Date;

public class ReadUser01 implements Reader {
    private Rss rss;
    private String name;

    public ReadUser01(Rss rss, String name) {
        this.rss = rss;
        this.name = name;
        rss.subscribeRss(this);
    }

    @Override
    public void update() {
        if (rss instanceof RssDate) {
            String publicName = ((RssDate) rss).getPublicName();
            String massage = ((RssDate) rss).getMassage();
            Date date = ((RssDate) rss).getDate();

            System.out.println("name : " + name);
            System.out.println("publicName : " + publicName);
            System.out.println("massage : " + massage);
            System.out.println("date : " + date);
        }
    }
}
