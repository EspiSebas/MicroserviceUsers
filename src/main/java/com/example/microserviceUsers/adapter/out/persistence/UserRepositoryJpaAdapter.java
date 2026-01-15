package com.example.microserviceUsers.adapter.out.persistence;

import com.example.microserviceUsers.domain.model.Users;
import com.example.microserviceUsers.domain.port.out.UsersRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryJpaAdapter implements UsersRepository {

    private final JpaUserRepository jpaUserRepository;

    public UserRepositoryJpaAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }


    @Override
    public Users saveUser(Users users) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(users.getName());
        userEntity.setLast(users.getLast());
        userEntity.setDateBirthday(users.getDateBirthday());
        userEntity.setNumberCellphone(users.getNumberCellphone());
        userEntity.setEmail(users.getEmail());
        userEntity.setPassword(users.getPassword());
        userEntity.setRole(users.getRole().name());

        jpaUserRepository.save(userEntity);

        return users;
    }

    @Override
    public Users logInUser(Users users) {
        return null;
    }
}
