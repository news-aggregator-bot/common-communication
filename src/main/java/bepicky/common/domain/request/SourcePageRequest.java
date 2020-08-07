package bepicky.common.domain.request;

import bepicky.common.domain.dto.CategoryDto;
import bepicky.common.domain.dto.LanguageDto;
import lombok.Data;

import java.util.List;

@Data
public class SourcePageRequest {

    private String name;

    private String url;

    private LanguageDto language;

    private List<CategoryDto> categories;
}
