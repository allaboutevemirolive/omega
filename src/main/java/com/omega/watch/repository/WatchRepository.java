package com.omega.watch.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.omega.watch.modal.User;
import com.omega.watch.modal.Watch;

// TODO: Remove perfume with watches and populate database
public interface WatchRepository extends JpaRepository<Watch, Long> {

    List<Watch> findByIdIn(List<Long> perfumesIds);

    Page<Watch> findAllByOrderByPriceAsc(Pageable pageable);

    @Query("SELECT perfume FROM Perfume perfume WHERE " +
            "(CASE " +
            "   WHEN :searchType = 'perfumeTitle' THEN UPPER(perfume.perfumeTitle) " +
            "   WHEN :searchType = 'country' THEN UPPER(perfume.country) " +
            "   ELSE UPPER(perfume.perfumer) " +
            "END) " +
            "LIKE UPPER(CONCAT('%',:text,'%')) " +
            "ORDER BY perfume.price ASC")
    Page<Watch> searchWatches(String searchType, String text, Pageable pageable);

    @Query("SELECT perfume FROM Perfume perfume " +
            "WHERE (coalesce(:perfumers, null) IS NULL OR perfume.perfumer IN :perfumers) " +
            "AND (coalesce(:genders, null) IS NULL OR perfume.perfumeGender IN :genders) " +
            "AND (coalesce(:priceStart, null) IS NULL OR perfume.price BETWEEN :priceStart AND :priceEnd) " +
            "ORDER BY perfume.price ASC")
    Page<Watch> getWatchesByFilterParams(
            List<String> perfumers,
            List<String> genders,
            Integer priceStart,
            Integer priceEnd,
            Pageable pageable);
}
