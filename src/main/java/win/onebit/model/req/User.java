
package win.onebit.model.req;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class User {

    @SerializedName("attributes")
    private win.onebit.model.req.Attributes Attributes;
    @SerializedName("user_id")
    private String UserId;

    public win.onebit.model.req.Attributes getAttributes() {
        return Attributes;
    }

    public void setAttributes(win.onebit.model.req.Attributes attributes) {
        Attributes = attributes;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

}
