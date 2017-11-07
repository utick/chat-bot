
package win.onebit.model.req;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Slots {

    @SerializedName("bizname")
    private String Bizname;
    @SerializedName("type")
    private String Type;

    public String getBizname() {
        return Bizname;
    }

    public void setBizname(String bizname) {
        Bizname = bizname;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}
