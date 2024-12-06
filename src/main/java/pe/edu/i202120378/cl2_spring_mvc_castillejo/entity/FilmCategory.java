package pe.edu.i202120378.cl2_spring_mvc_castillejo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategory {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private FilmCategoryPk filmCategoryPk;
    private Date lastUpdate;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id", insertable = false, updatable = false)
    private Film film;

}

