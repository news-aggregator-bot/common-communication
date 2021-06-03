package bepicky.common.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotifyMessageRequest {

    private Set<Long> readers;

    private String message;
}
