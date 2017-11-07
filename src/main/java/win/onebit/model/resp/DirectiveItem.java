
package win.onebit.model.resp;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;

@NoArgsConstructor
@AllArgsConstructor
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DirectiveItem {

    @SerializedName("content")
    private String Content;
    @SerializedName("type")
    private String Type;

    public String getContent() {
        return Content;
    }

    public String getType() {
        return Type;
    }

    public static class Builder {

        private String Content;
        private String Type;

        public DirectiveItem.Builder withContent(String content) {
            Content = content;
            return this;
        }

        public DirectiveItem.Builder withType(String type) {
            Type = type;
            return this;
        }

        public DirectiveItem build() {
            DirectiveItem DirectiveItem = new DirectiveItem();
            DirectiveItem.Content = Content;
            DirectiveItem.Type = Type;
            return DirectiveItem;
        }

    }

}
