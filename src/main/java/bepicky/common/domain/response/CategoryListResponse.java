package bepicky.common.domain.response;

import bepicky.common.domain.dto.CategoryDto;
import bepicky.common.domain.dto.ReaderDto;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class CategoryListResponse extends AbstractListResponse<CategoryDto> {

    public CategoryListResponse(List<CategoryDto> list, boolean first, boolean last, ReaderDto reader) {
        super(list, first, last, reader);
    }

    public CategoryListResponse(ErrorResponse error) {
        super(error);
    }
}
