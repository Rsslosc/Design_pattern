package ObserverPattern_RSS;

import java.util.Date;

public class ReadUser02 implements Reader {
    private Rss rss;
    private String name;

    public ReadUser02(Rss rss, String name) {
        this.rss = rss;
        this.name = name;
        rss.subscribeRss(this);
    }

    @Override
    public void update() {
        if (rss instanceof RssDate) {
            Date date = ((RssDate) rss).getDate();
            String massage = ((RssDate) rss).getMassage();
            String publicName = ((RssDate) rss).getPublicName();

            System.out.println("name : " + name);
            System.out.println("date ：" + date);
            System.out.println("massage ：" + massage);
            System.out.println("publicName ：" + publicName);
        }

    }
}
