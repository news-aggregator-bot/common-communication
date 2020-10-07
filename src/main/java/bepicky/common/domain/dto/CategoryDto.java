package bepicky.common.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {

    private long id;
    private String name;
    private String type;
    private String localised;
    private boolean picked;
    private CategoryDto parent;
    private List<CategoryDto> children;
}
