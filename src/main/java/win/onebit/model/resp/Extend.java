
package win.onebit.model.resp;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Extend {

    @SerializedName("NO_REC")
    private String NOREC;

    public String getNOREC() {
        return NOREC;
    }

    public static class Builder {

        private String NOREC;

        public Extend.Builder withNOREC(String NOREC) {
            this.NOREC = NOREC;
            return this;
        }

        public Extend build() {
            Extend Extend = new Extend();
            Extend.NOREC = NOREC;
            return Extend;
        }

    }

}
