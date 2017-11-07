
package win.onebit.model.resp;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Directive {

    @SerializedName("directive_items")
    private List<DirectiveItem> DirectiveItems;

    public List<DirectiveItem> getDirectiveItems() {
        return DirectiveItems;
    }

    public static class Builder {

        private List<DirectiveItem> DirectiveItems;

        public Directive.Builder withDirectiveItems(List<DirectiveItem> directiveItems) {
            DirectiveItems = directiveItems;
            return this;
        }

        public Directive build() {
            Directive Directive = new Directive();
            Directive.DirectiveItems = DirectiveItems;
            return Directive;
        }

    }

}
