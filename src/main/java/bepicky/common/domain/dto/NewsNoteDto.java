package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsNoteDto {

    private String title;

    private String url;

    private String author;

    private Date date;

    @JsonProperty("source_pages")
    private List<SourcePageDto> sourcePages;
}
