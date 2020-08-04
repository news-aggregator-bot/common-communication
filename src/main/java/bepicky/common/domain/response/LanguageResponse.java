package bepicky.common.domain.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LanguageResponse {

    private String lang;

    private String name;

    private String localized;

    public LanguageResponse() {}

    public LanguageResponse(String lang, String name, String localized) {
        this.lang = lang;
        this.name = name;
        this.localized = localized;
    }

}
