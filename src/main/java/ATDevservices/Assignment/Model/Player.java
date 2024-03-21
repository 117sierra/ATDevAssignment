package ATDevservices.Assignment.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(nullable = false)
    private String dateOfBirth;
    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties("player")
    private Match match;
}
