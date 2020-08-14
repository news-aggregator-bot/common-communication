package bepicky.common.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotifyReaderRequest {

    private long chatId;

    private String lang;

    private List<NewsNoteRequest> notes;
}
