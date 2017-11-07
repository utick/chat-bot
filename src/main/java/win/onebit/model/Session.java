
package win.onebit.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Session {

    @SerializedName("attributes")
    private Attributes mAttributes;
    @SerializedName("is_new")
    private Boolean mIsNew;
    @SerializedName("session_id")
    private String mSessionId;

    public Attributes getAttributes() {
        return mAttributes;
    }

    public void setAttributes(Attributes attributes) {
        mAttributes = attributes;
    }

    public Boolean getIsNew() {
        return mIsNew;
    }

    public void setIsNew(Boolean isNew) {
        mIsNew = isNew;
    }

    public String getSessionId() {
        return mSessionId;
    }

    public void setSessionId(String sessionId) {
        mSessionId = sessionId;
    }

}
