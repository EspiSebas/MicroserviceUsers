package com.example.microserviceUsers.adapter.out.persistence;

import com.example.microserviceUsers.domain.model.Users;
import com.example.microserviceUsers.domain.port.out.UsersRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Period;

@Repository
public class UserRepositoryJpaAdapter implements UsersRepository {

    private final JpaUserRepository jpaUserRepository;

    public UserRepositoryJpaAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }


    @Override
    public Users saveUser(Users users) {

        if(!users.getPhoneNumber().matches("^\\+[0-9]+$")){
            throw new IllegalArgumentException("The phoneNumber is wrong !!");
        }

        if(Period.between(users.getbirthDate(),LocalDate.now()).getYears() < 18 ){
            throw new IllegalArgumentException("You are not adult !!");
        }

        if(users.getPhoneNumber().length() > 13 ){
            throw new IllegalArgumentException("The length is too long");
        }


        UserEntity userEntity = new UserEntity();
        userEntity.setName(users.getName());
        userEntity.setLast(users.getLast());
        userEntity.setBirthDate(users.getbirthDate());
        userEntity.setPhoneNumber(users.getPhoneNumber());
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
