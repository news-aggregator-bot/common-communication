package bepicky.common.domain.response;

import lombok.Getter;

@Getter
public class PickLanguageResponse extends AbstractResponse {

    private LanguageResponse language;

    public PickLanguageResponse(String lang, LanguageResponse language) {
        super(lang);
        this.language = language;
    }

    public PickLanguageResponse(ErrorResponse error) {
        super(error);
    }
}
