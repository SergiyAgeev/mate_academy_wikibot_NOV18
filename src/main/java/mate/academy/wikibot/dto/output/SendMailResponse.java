package mate.academy.wikibot.dto.output;

import java.util.List;

import lombok.Data;

/**
 * Class is dto for response.
 */
@Data
public class SendMailResponse {
    private Status status;
    private List<String> errors;

    public enum Status {
        OK(0),
        ERROR(400);

        int status;

        Status(int status) {
            this.status = status;
        }
    }
}
