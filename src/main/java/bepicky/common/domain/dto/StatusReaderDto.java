package bepicky.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Set;
import java.util.stream.Collectors;

@Data
public class StatusReaderDto {

    private String username;

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;

    private String status;

    @JsonProperty("primary_language")
    private LanguageDto primaryLanguage;

    private Set<LanguageDto> languages;

    private Set<CategoryDto> categories;

    private Set<SourceDto> sources;

    private Set<String> tags;

    @JsonIgnore
    public Set<CategoryDto> getRegions() {
        return categories.stream().filter(c -> "REGION".equals(c.getType())).collect(Collectors.toSet());
    }

    @JsonIgnore
    public Set<CategoryDto> getCommons() {
        return categories.stream().filter(c -> "COMMON".equals(c.getType())).collect(Collectors.toSet());
    }
}
