
package win.onebit.model.resp;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CommandResp {

    @SerializedName("directive")
    private win.onebit.model.resp.Directive Directive;
    @SerializedName("extend")
    private win.onebit.model.resp.Extend Extend;
    @SerializedName("is_end")
    private Boolean IsEnd;
    @SerializedName("sequence")
    private String Sequence;
    @SerializedName("timestamp")
    private Long Timestamp;
    @SerializedName("versionid")
    private String Versionid;
    @SerializedName("push_to_app")
    private Card card;

    public win.onebit.model.resp.Directive getDirective() {
        return Directive;
    }

    public win.onebit.model.resp.Extend getExtend() {
        return Extend;
    }

    public Boolean getIsEnd() {
        return IsEnd;
    }

    public String getSequence() {
        return Sequence;
    }

    public Long getTimestamp() {
        return Timestamp;
    }

    public String getVersionid() {
        return Versionid;
    }

    public Card getCard() {
        return card;
    }

    public static class Builder {

        private win.onebit.model.resp.Directive Directive;
        private win.onebit.model.resp.Extend Extend;
        private Boolean IsEnd;
        private String Sequence;
        private Long Timestamp;
        private String Versionid;
        private Card card;

        public CommandResp.Builder withDirective(win.onebit.model.resp.Directive directive) {
            Directive = directive;
            return this;
        }

        public CommandResp.Builder withExtend(win.onebit.model.resp.Extend extend) {
            Extend = extend;
            return this;
        }

        public CommandResp.Builder withIsEnd(Boolean isEnd) {
            IsEnd = isEnd;
            return this;
        }

        public CommandResp.Builder withSequence(String sequence) {
            Sequence = sequence;
            return this;
        }

        public CommandResp.Builder withTimestamp(Long timestamp) {
            Timestamp = timestamp;
            return this;
        }

        public CommandResp.Builder withVersionid(String versionid) {
            Versionid = versionid;
            return this;
        }

        public CommandResp.Builder withCard(Card card1) {
            card = card1;
            return this;
        }

        public CommandResp build() {
            CommandResp CommandResp = new CommandResp();
            CommandResp.Directive = Directive;
            CommandResp.Extend = Extend;
            CommandResp.IsEnd = IsEnd;
            CommandResp.Sequence = Sequence;
            CommandResp.Timestamp = Timestamp;
            CommandResp.Versionid = Versionid;
            CommandResp.card = card;
            return CommandResp;
        }

    }

}
