
package win.onebit.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Message {

    @SerializedName("application_info")
    private ApplicationInfo mApplicationInfo;
    @SerializedName("extend")
    private Extend mExtend;
    @SerializedName("input_text")
    private String mInputText;
    @SerializedName("sequence")
    private String mSequence;
    @SerializedName("session")
    private Session mSession;
    @SerializedName("slots")
    private Slots mSlots;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("timestamp")
    private Long mTimestamp;
    @SerializedName("user")
    private User mUser;
    @SerializedName("versionid")
    private String mVersionid;

    public ApplicationInfo getApplicationInfo() {
        return mApplicationInfo;
    }

    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        mApplicationInfo = applicationInfo;
    }

    public Extend getExtend() {
        return mExtend;
    }

    public void setExtend(Extend extend) {
        mExtend = extend;
    }

    public String getInputText() {
        return mInputText;
    }

    public void setInputText(String inputText) {
        mInputText = inputText;
    }

    public String getSequence() {
        return mSequence;
    }

    public void setSequence(String sequence) {
        mSequence = sequence;
    }

    public Session getSession() {
        return mSession;
    }

    public void setSession(Session session) {
        mSession = session;
    }

    public Slots getSlots() {
        return mSlots;
    }

    public void setSlots(Slots slots) {
        mSlots = slots;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public Long getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(Long timestamp) {
        mTimestamp = timestamp;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String getVersionid() {
        return mVersionid;
    }

    public void setVersionid(String versionid) {
        mVersionid = versionid;
    }

}
