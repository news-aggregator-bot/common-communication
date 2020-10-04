package bepicky.common.domain.dto;

import lombok.Data;

@Data
public class SourceDto implements Comparable<SourceDto> {

    private long id;

    private String name;

    private boolean picked;

    @Override
    public int compareTo(SourceDto o) {
        return name.compareTo(o.name);
    }
}
