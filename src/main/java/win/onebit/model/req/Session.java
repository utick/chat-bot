
package win.onebit.model.req;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Session {

    @SerializedName("attributes")
    private win.onebit.model.req.Attributes Attributes;
    @SerializedName("is_new")
    private Boolean IsNew;
    @SerializedName("session_id")
    private String SessionId;

    public win.onebit.model.req.Attributes getAttributes() {
        return Attributes;
    }

    public void setAttributes(win.onebit.model.req.Attributes attributes) {
        Attributes = attributes;
    }

    public Boolean getIsNew() {
        return IsNew;
    }

    public void setIsNew(Boolean isNew) {
        IsNew = isNew;
    }

    public String getSessionId() {
        return SessionId;
    }

    public void setSessionId(String sessionId) {
        SessionId = sessionId;
    }

}
