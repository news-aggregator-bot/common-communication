package bepicky.common.domain.response;

import bepicky.common.domain.dto.ReaderDto;
import bepicky.common.domain.dto.SourceDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SourceListResponse extends AbstractListResponse<SourceDto> {

    public SourceListResponse(List<SourceDto> list, boolean first, boolean last, ReaderDto reader) {
        super(list, first, last, reader);
    }

    public SourceListResponse(ErrorResponse error) {
        super(error);
    }
}
