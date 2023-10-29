package com.aibooking.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aibooking.location.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {

}
