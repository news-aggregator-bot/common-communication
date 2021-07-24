package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsNoteNotificationDto extends NewsNoteDto {
    private LinkDto link;

    @JsonProperty("link_key")
    private String linkKey;

    public enum LinkDto {
        CATEGORY, TAG
    }
}
