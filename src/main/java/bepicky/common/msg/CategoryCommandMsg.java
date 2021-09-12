package bepicky.common.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryCommandMsg {

    @JsonProperty("chat_id")
    private long chatId;

    @JsonProperty("category_id")
    private long categoryId;

    private MsgCommand command;

}
