package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toSet;

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

    public String getRegions() {
        return getSourcePages().stream()
            .flatMap(s -> s.getRegions().stream())
            .map(CategoryDto::getLocalised)
            .collect(collectingAndThen(toSet(), set -> String.join(", ", set)));
    }

    public String getCommons() {
        return getSourcePages().stream()
            .flatMap(s -> s.getRegions().stream())
            .map(CategoryDto::getLocalised)
            .collect(collectingAndThen(toSet(), set -> String.join(", ", set)));
    }
}
