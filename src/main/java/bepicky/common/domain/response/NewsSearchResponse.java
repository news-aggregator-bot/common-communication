package bepicky.common.domain.response;

import bepicky.common.domain.dto.NewsNoteDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NewsSearchResponse extends AbstractListResponse<NewsNoteDto> {

    private String key;
    @JsonProperty("total_el")
    private long totalElements;
    @JsonProperty("total_pages")
    private int totalPages;

}
