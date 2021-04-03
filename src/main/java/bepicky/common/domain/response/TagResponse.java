package bepicky.common.domain.response;

import bepicky.common.domain.dto.ReaderDto;
import bepicky.common.domain.dto.TagDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TagResponse extends AbstractResponse {
    private TagDto tag;

    public TagResponse(ReaderDto reader, TagDto tag) {
        super(reader);
        this.tag = tag;
    }

    public TagResponse(ErrorResponse error) {
        super(error);
    }
}
