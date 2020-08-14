package bepicky.common.domain.request;

import bepicky.common.domain.dto.CategoryDto;
import bepicky.common.domain.dto.LanguageDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SourcePageRequest {

    private String name;

    private String url;

    private LanguageDto language;

    private List<CategoryDto> categories;
}
