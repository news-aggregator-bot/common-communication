package bepicky.common.domain.request;

import bepicky.common.domain.dto.NewsNoteNotificationDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsNotificationRequest {

    @JsonProperty("chat_id")
    private Long chatId;

    private String lang;

    private NewsNoteNotificationDto notification;
}
