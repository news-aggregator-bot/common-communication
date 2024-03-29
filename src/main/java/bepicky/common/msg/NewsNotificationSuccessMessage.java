package bepicky.common.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsNotificationSuccessMessage {

    @JsonProperty("chat_id")
    private Long chatId;

    @JsonProperty("note_id")
    private Long noteId;
}
