package bepicky.common.domain.response;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class AbstractListResponse<T> extends AbstractResponse {

    private List<T> list;
    private boolean last;

    public AbstractListResponse(List<T> list, boolean last, String language) {
        super(language);
        this.list = list;
        this.last = last;
    }

    public AbstractListResponse(ErrorResponse error) {
        super(error);
    }
}
