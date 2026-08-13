package com.devsuperior.Desafio5.repositories;

import com.devsuperior.Desafio5.entities.User;
import com.devsuperior.Desafio5.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = """
        SELECT user.email AS username, user.password, role.id AS roleId, role.authority 
        FROM tb_user AS user 
        INNER JOIN tb_user_role ON user.id = tb_user_role.user_id 
        INNER JOIN tb_role AS role ON role.id = tb_user_role.user_id 
        WHERE user.email = :email
""")
    List<UserDetailsProjection> searchUserAndRolesByEmail(String email);

    Optional<User> findByEmail(String email);

}
