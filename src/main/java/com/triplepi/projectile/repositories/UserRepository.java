package com.triplepi.projectile.repositories;

import com.triplepi.projectile.models.domain.MesUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MesUser, Long> {
}
