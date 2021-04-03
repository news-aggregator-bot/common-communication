package bepicky.common.domain.response;

import bepicky.common.domain.dto.TagDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagListResponse {
    private List<TagDto> list;
}
