package bepicky.common.domain.response;

import bepicky.common.domain.dto.ReaderDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class AbstractListResponse<T> extends AbstractResponse {

    private List<T> list;
    private boolean first;
    private boolean last;

    public AbstractListResponse(List<T> list, boolean first, boolean last, ReaderDto reader) {
        super(reader);
        this.list = list;
        this.first = first;
        this.last = last;
    }

    public AbstractListResponse(ErrorResponse error) {
        super(error);
    }
}
