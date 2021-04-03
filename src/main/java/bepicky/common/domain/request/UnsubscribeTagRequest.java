package bepicky.common.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnsubscribeTagRequest {
    @JsonProperty("chat_id")
    @NotNull
    private Long chatId;

    @JsonProperty("tag_id")
    @NotBlank
    private Long tagId;
}