package bepicky.common.domain.response;

import bepicky.common.domain.dto.LanguageDto;
import bepicky.common.domain.dto.ReaderDto;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class LanguageListResponse extends AbstractListResponse<LanguageDto> {


    public LanguageListResponse(List<LanguageDto> list, boolean first, boolean last, ReaderDto reader) {
        super(list, first, last, reader);
    }

    public LanguageListResponse(ErrorResponse error) {
        super(error);
    }
}
