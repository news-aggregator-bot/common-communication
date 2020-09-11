package bepicky.common.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotifyNewsRequest {

    @JsonProperty("chat_id")
    private long chatId;

    private String lang;

    private List<NewsNoteRequest> notes;
}
