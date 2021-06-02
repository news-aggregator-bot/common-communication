package bepicky.common.domain.response;

import bepicky.common.domain.dto.NewsNoteDto;
import bepicky.common.domain.dto.ReaderDto;
import bepicky.common.domain.dto.TagDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TagResponse extends AbstractResponse {
    private TagDto tag;
    private List<NewsNoteDto> news = new ArrayList<>();

    public TagResponse(ReaderDto reader, TagDto tag) {
        super(reader);
        this.tag = tag;
    }

    public TagResponse(ReaderDto reader, TagDto tag, List<NewsNoteDto> news) {
        super(reader);
        this.tag = tag;
        this.news = news;
    }

    public TagResponse(ErrorResponse error) {
        super(error);
    }

    public TagResponse(ErrorResponse error, ReaderDto reader) {
        super(error, reader);
    }
}
