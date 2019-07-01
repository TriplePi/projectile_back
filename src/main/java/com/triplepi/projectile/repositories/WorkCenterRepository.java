package com.triplepi.projectile.repositories;

import com.triplepi.projectile.models.domain.ScheduleItemWorkCenterDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkCenterRepository extends JpaRepository<ScheduleItemWorkCenterDTO, Long> {
}
