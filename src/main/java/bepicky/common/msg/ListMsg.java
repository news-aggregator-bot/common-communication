package bepicky.common.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ListMsg {

    @JsonProperty("chat_id")
    private long chatId;

    @JsonProperty("page")
    private int page;

    @JsonProperty("size")
    private int size;

    private ListCommand command;
}
