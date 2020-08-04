package bepicky.common.domain.response;

import lombok.Getter;

@Getter
public abstract class AbstractResponse {

    private String lang;
    private ErrorResponse error;

    public AbstractResponse(String lang) {
        this.lang = lang;
    }

    public AbstractResponse(ErrorResponse error) {
        this.error = error;
    }
}
