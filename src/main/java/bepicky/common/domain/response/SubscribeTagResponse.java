package bepicky.common.domain.response;

import bepicky.common.domain.dto.ReaderDto;
import bepicky.common.domain.dto.TagDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SubscribeTagResponse extends AbstractResponse {
    private TagDto tag;

    public SubscribeTagResponse(ReaderDto reader, TagDto tag) {
        super(reader);
        this.tag = tag;
    }

    public SubscribeTagResponse(ErrorResponse error) {
        super(error);
    }
}
