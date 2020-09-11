package bepicky.common.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsNoteRequest {

    private String title;

    private String url;

    private String author;

    @JsonProperty("source_page")
    private SourcePageRequest sourcePage;
}
