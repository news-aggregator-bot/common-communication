package bepicky.common.domain.response;

import java.util.List;

public class ListLanguageResponse extends AbstractListResponse<LanguageResponse> {

    public ListLanguageResponse(List<LanguageResponse> list, boolean first, boolean last, String language) {
        super(list, first, last, language);
    }

    public ListLanguageResponse(ErrorResponse error) {
        super(error);
    }
}
