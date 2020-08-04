package bepicky.common.domain.response;

import java.util.List;

public class ListCategoryResponse extends AbstractListResponse<CategoryResponse> {

    public ListCategoryResponse(List<CategoryResponse> list, boolean last, String language) {
        super(list, last, language);
    }

    public ListCategoryResponse(ErrorResponse error) {
        super(error);
    }
}
