package bepicky.common.domain.response;

import bepicky.common.domain.dto.ReaderDto;
import bepicky.common.domain.dto.TagDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagListResponse extends AbstractResponse {
    private List<TagDto> list;

    public TagListResponse(ErrorResponse error) {
        super(error);
    }

    public TagListResponse(
        ReaderDto reader,
        List<TagDto> list
    ) {
        super(reader);
        this.list = list;
    }
}
