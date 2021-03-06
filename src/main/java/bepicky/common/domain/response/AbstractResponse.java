package bepicky.common.domain.response;

import bepicky.common.domain.dto.ReaderDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class AbstractResponse {

    private ReaderDto reader;
    private ErrorResponse error;

    public AbstractResponse(ReaderDto reader) {
        this.reader = reader;
    }

    public AbstractResponse(ErrorResponse error) {
        this.error = error;
    }

    public AbstractResponse(ErrorResponse error, ReaderDto reader) {
        this.error = error;
        this.reader = reader;
    }

    public boolean isError() {
        return error != null;
    }
}
