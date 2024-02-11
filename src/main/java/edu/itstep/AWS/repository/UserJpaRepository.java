package edu.itstep.AWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.itstep.AWS.dto.UserDTO;
@Repository
public interface UserJpaRepository extends JpaRepository<UserDTO, Long>{

}
