package bepicky.common.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageCommandMsg {

    @JsonProperty("chat_id")
    private long chatId;

    @JsonProperty("lang")
    private String lang;

    private MsgCommand command;
}
