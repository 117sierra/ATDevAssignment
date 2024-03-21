package Dto;

import ATDevservices.Assignment.Model.Match;
import ATDevservices.Assignment.Model.Player;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
public class Playerdto {
    private String name;
    private String dateOfBirth;
    private int score;
    private String stadium;

    public Player dto() {
        Match matchdata= Match.builder().score(this.score).stadium(this.stadium).build();
        return Player.builder().dateOfBirth(this.dateOfBirth).name(this.name).build();
    }

    }
