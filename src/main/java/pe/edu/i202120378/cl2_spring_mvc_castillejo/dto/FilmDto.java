package pe.edu.i202120378.cl2_spring_mvc_castillejo.dto;

public record FilmDto(Integer filmId,
                      String title,
                      String language,
                      Integer rentalDuration,
                      Double rentalRate) {
}
