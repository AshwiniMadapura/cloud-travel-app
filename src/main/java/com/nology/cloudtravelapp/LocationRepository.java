package com.nology.cloudtravelapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Locations,Integer> {
    int deleteLocationByLocationId(int locationId);
}
