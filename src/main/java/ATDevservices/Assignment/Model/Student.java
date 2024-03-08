package ATDevservices.Assignment.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30)
    private String name;

    @Column(length = 30)
    private String address;

    @Column(nullable = false,unique = true)
    private String contact;

    @Column(length = 30, unique = true)
    private String email;



}

