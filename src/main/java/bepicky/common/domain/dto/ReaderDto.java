package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Set;

@Data
public class ReaderDto {

    private Long id;

    @JsonProperty("chat_id")
    private Long chatId;

    private String username;

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;

    private String status;

    private String platform;

    @JsonProperty("primary_language")
    private LanguageDto primaryLanguage;

    private Set<LanguageDto> languages;

    public String getLang() {
        return primaryLanguage.getLang();
    }
}
