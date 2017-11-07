
package win.onebit.model.req;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.annotation.Generated;
import java.util.Map;

@Data
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CommandReq {

    @SerializedName("application_info")
    private win.onebit.model.req.ApplicationInfo ApplicationInfo;
    @SerializedName("extend")
    private win.onebit.model.req.Extend Extend;
    @SerializedName("input_text")
    private String InputText;
    @SerializedName("sequence")
    private String Sequence;
    @SerializedName("session")
    private win.onebit.model.req.Session Session;
    @SerializedName("slots")
    private Map<String, String> Slots;
    @SerializedName("status")
    private String Status;
    @SerializedName("timestamp")
    private Long Timestamp;
    @SerializedName("user")
    private win.onebit.model.req.User User;
    @SerializedName("versionid")
    private String Versionid;
}
