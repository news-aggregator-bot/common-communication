package bepicky.common.msg;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryListMsg extends ListMsg {

    private String type;

    private long id;
}
