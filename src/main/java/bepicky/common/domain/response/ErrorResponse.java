package bepicky.common.domain.response;

import bepicky.common.ErrorUtil;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {

    private int code;

    private String entity;

    public boolean isReader() {
        return ErrorUtil.READER.equals(entity);
    }

    public boolean isReaderInactive() {
        return isReader() && isBadRequest();
    }

    public boolean isReaderNotFound() {
        return isReader() && isNotFound();
    }

    public boolean isNotFound() {
        return 404 == code;
    }

    public boolean isBadRequest() {
        return 400 == code;
    }
}
