package pe.edu.i202120378.cl2_spring_mvc_castillejo.service;

import pe.edu.i202120378.cl2_spring_mvc_castillejo.dto.FilmCreateDto;
import pe.edu.i202120378.cl2_spring_mvc_castillejo.dto.FilmDetailDto;
import pe.edu.i202120378.cl2_spring_mvc_castillejo.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findDetailById(Integer id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    Boolean createFilm(FilmCreateDto filmCreateDto);
    Boolean deleteFilmById(Integer id);

}
