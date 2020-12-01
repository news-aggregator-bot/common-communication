package bepicky.common.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReaderRequest {

    @JsonProperty("chat_id")
    private Long chatId;

    private String username;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @NotBlank
    private String platform;

    @JsonProperty("primary_language")
    @NotBlank
    private String primaryLanguage;
}
