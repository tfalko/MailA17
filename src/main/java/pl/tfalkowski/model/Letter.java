package pl.tfalkowski.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="letter")
public class Letter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=2, max=200)
    private String name;

    @Size(max=200)
    private String description;

    private LocalDateTime created;

    private boolean archived = false;

    @ManyToOne
    private Category category;

    @PrePersist
    public void setCreatedOnPersist() {
        created = LocalDateTime.now();
    }

}
