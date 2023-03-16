package meta.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import meta.api.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
