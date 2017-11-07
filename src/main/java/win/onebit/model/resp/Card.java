package win.onebit.model.resp;

import lombok.Data;

/**
 * Created by somebody on 2017/11/7.
 */
@Data
public class Card {
    String title;
    String type;
    String text;
    String url;
    RichContent[] rich_contents;
}
