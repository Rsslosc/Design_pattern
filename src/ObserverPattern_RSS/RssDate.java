package ObserverPattern_RSS;

import java.util.ArrayList;
import java.util.Date;

public class RssDate implements Rss {
    private ArrayList<Reader> readerArrayList = new ArrayList<>();

    private String massage;
    private Date date;
    private String PublicName;

    public void setMassage(String massage, Date date, String PublicName) {
        this.massage = massage;
        this.date = date;
        this.PublicName = PublicName;
        notifyReader();
    }


    @Override
    public void subscribeRss(Reader reader) {
        if (!readerArrayList.contains(reader)) {
            readerArrayList.add(reader);
        }
    }

    @Override
    public void unsubscribeRss(Reader reader) {
        readerArrayList.remove(reader);
    }

    @Override
    public void notifyReader() {
        for (Reader reader : readerArrayList) {
            reader.update();
        }
    }

    public String getMassage() {
        return massage;
    }

    public Date getDate() {
        return date;
    }

    public String getPublicName() {
        return PublicName;
    }
}
