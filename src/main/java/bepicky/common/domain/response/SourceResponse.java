package bepicky.common.domain.response;

import bepicky.common.domain.dto.ReaderDto;
import bepicky.common.domain.dto.SourceDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SourceResponse extends AbstractResponse {

    private SourceDto source;

    public SourceResponse(ReaderDto reader, SourceDto source) {
        super(reader);
        this.source = source;
    }

    public SourceResponse(ErrorResponse error) {
        super(error);
    }
}
