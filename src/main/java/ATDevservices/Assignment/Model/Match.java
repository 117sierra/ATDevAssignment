package ATDevservices.Assignment.Model;
import lombok.*;

import jakarta.persistence.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
@Entity

public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int score;
    @Column(nullable = false)
    private String stadium;
    @OneToMany
    private List<Player> player;

}
