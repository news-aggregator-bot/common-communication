package bepicky.common.domain.request;

import bepicky.common.domain.dto.CategoryDto;
import bepicky.common.domain.dto.LanguageDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SourcePageRequest {

    private String name;

    private String url;

    private LanguageDto language;

    private List<CategoryDto> categories;

    public List<CategoryDto> getRegions() {
        return categories.stream().filter(c -> "REGION".equals(c.getType())).collect(Collectors.toList());
    }

    public List<CategoryDto> getCommons() {
        return categories.stream().filter(c -> "COMMON".equals(c.getType())).collect(Collectors.toList());
    }
}
