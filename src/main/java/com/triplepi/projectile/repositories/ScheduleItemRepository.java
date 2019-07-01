package com.triplepi.projectile.repositories;

import com.triplepi.projectile.models.domain.ScheduleItemDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleItemRepository extends JpaRepository<ScheduleItemDTO, Long> {
}
