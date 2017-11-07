package win.onebit.model.req;

import lombok.Builder;
import lombok.Data;

/**
 * Created by somebody on 2017/11/7.
 */
@Data
@Builder
public class TuLingReq {
    String key;
    String info;
    String userId;
}
