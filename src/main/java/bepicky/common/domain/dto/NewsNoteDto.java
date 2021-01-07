package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsNoteDto {

    private String title;

    private String url;

    private String author;

    @JsonProperty("source_page")
    private SourcePageDto sourcePage;
}
