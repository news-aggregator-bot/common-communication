package bepicky.common.domain.response;

import bepicky.common.domain.dto.NewsNoteDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NewsSearchResponse extends AbstractListResponse<NewsNoteDto> {

    private String key;

}
