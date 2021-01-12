package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SourcePageDto {

    private String name;

    private String url;

    @JsonProperty("source_name")
    private String sourceName;

    private List<LanguageDto> languages;

    private List<CategoryDto> categories;

    public List<CategoryDto> getRegions() {
        return categories.stream().filter(c -> "REGION".equals(c.getType())).collect(Collectors.toList());
    }

    public List<CategoryDto> getCommons() {
        return categories.stream().filter(c -> "COMMON".equals(c.getType())).collect(Collectors.toList());
    }
}
