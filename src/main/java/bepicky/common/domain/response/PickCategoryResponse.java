package bepicky.common.domain.response;

import lombok.Getter;

@Getter
public class PickCategoryResponse extends AbstractResponse {

    private CategoryResponse category;

    public PickCategoryResponse(String lang, CategoryResponse category) {
        super(lang);
        this.category = category;
    }

    public PickCategoryResponse(ErrorResponse error) {
        super(error);
    }
}
