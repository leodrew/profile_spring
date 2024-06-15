package com.example.profile.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileRepostiory extends JpaRepository<Proflie, Long> {
    @Query(value = "SELECT * FROM public.profile w ", nativeQuery = true)
    List<Proflie> listWeather();
}
