package pe.edu.i202120378.cl2_spring_mvc_castillejo.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActorPk {

    private Integer actorId;
    private Integer filmId;

}

