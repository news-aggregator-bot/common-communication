package bepicky.common.domain.response;

import bepicky.common.domain.dto.CategoryDto;
import bepicky.common.domain.dto.ReaderDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CategoryResponse extends AbstractResponse {

    private CategoryDto category;

    public CategoryResponse(ReaderDto reader, CategoryDto category) {
        super(reader);
        this.category = category;
    }

    public CategoryResponse(ErrorResponse error) {
        super(error);
    }
}
