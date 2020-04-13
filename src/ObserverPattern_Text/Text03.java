package ObserverPattern_Text;

import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class Text03 extends TextArea implements Observer {
    public Text03() {
        this.setEditable(false);
    }
    @Override
    public void showMassage(String massage) {
        this.setText("单词格式为：" + getWordCount(massage));
    }
    public static int getWordCount(String content){
        int count = 0;
        String cn_words = content.replaceAll("[^(\\u4e00-\\u9fa5，。《》？；’‘：“”【】、）（……￥！·)]", "");
        int cn_words_count = cn_words.length();
        String non_cn_words = content.replaceAll("[^(a-zA-Z0-9`\\-=\';.,/~!@#$%^&*()_+|}{\":><?\\[\\])]", " ");
        int non_cn_words_count = 0;
        String[] temp = non_cn_words.split(" ");
        for(String ch:temp){
            if(ch.trim().length() != 0) non_cn_words_count++;
        }
        count = cn_words_count + non_cn_words_count;
        return count;
    }
}
