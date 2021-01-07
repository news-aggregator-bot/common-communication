package bepicky.common.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsSearchRequest {

    @JsonProperty("chat_id")
    private long chatId;

    private String key;

    private int page;

    @JsonProperty("page_size")
    private int pageSize;
}
