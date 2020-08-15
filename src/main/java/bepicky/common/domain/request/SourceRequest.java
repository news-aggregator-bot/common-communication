package bepicky.common.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceRequest {

    @JsonProperty("chat_id")
    private long chatId;

    @JsonProperty("source_id")
    private long sourceId;
}
