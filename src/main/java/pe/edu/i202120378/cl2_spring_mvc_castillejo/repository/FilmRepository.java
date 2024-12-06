package pe.edu.i202120378.cl2_spring_mvc_castillejo.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import pe.edu.i202120378.cl2_spring_mvc_castillejo.entity.Film;


public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Cacheable(value = "films")
    Iterable<Film> findAll();

    @CacheEvict(value = "films", allEntries = true)
    Film save(Film film);

    @CacheEvict(value = "films", allEntries = true)
    void delete(Film film);

}
