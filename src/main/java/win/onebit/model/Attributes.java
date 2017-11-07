
package win.onebit.model;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Attributes {

    @SerializedName("bizname")
    private String mBizname;
    @SerializedName("type")
    private String mType;

    public String getBizname() {
        return mBizname;
    }

    public void setBizname(String bizname) {
        mBizname = bizname;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
