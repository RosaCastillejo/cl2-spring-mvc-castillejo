package pe.edu.i202120378.cl2_spring_mvc_castillejo.dto;

import java.util.Date;

public record FilmDetailDto(Integer filmId,
                            String title,
                            String description,
                            Integer releaseYear,
                            Integer rentalDuration,
                            Double rentalRate,
                            Integer length,
                            Double replacementCost,
                            String rating,
                            String specialFeatures,
                            Date lastUpdate) {

}
