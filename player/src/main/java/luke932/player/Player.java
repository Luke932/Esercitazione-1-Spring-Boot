package luke932.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {

    private int id;
    private String firstName;
    private String lastName;
    private String team;
    private String position;
}
