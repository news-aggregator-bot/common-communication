package bepicky.common.domain.response;

import bepicky.common.domain.dto.LanguageDto;
import bepicky.common.domain.dto.ReaderDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LanguageResponse extends AbstractResponse {

    private LanguageDto language;

    public LanguageResponse(ReaderDto reader, LanguageDto language) {
        super(reader);
        this.language = language;
    }

    public LanguageResponse(ErrorResponse error) {
        super(error);
    }
}
