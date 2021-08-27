package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsNoteDto {

    @JsonProperty("note_id")
    private Long noteId;

    private String title;

    private String url;

    private String author;

    private Date date;

    @JsonProperty("source_pages")
    private List<SourcePageDto> sourcePages = new ArrayList<>();

    public String getRegions() {
        return sourcePages.stream()
            .flatMap(s -> s.getRegions().stream())
            .map(CategoryDto::getLocalised)
            .collect(collectingAndThen(toSet(), set -> String.join(", ", set)));
    }

    public String getCommons() {
        return sourcePages.stream()
            .flatMap(s -> s.getCommons().stream())
            .map(CategoryDto::getLocalised)
            .collect(collectingAndThen(toSet(), set -> String.join(", ", set)));
    }

    public String getSources() {
        return getSourcePages()
            .stream()
            .map(SourcePageDto::getSourceName)
            .collect(Collectors.joining(","));
    }
}
