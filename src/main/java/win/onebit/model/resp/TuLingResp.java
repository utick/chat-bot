package win.onebit.model.resp;

import lombok.Builder;
import lombok.Data;

/**
 * Created by somebody on 2017/11/7.
 */
@Data
@Builder
public class TuLingResp {
    String key;
    String info;
    String userId;
}
