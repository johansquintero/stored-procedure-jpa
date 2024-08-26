package com.stored_procedures.Stored;

import com.stored_procedures.Stored.persistence.crud.IPersonCrudRepository;
import com.stored_procedures.Stored.persistence.entities.PersonEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class StoredProceduresApplication implements CommandLineRunner {

    private final IPersonCrudRepository personCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(StoredProceduresApplication.class, args);
    }


    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        List<PersonEntity> persons = this.personCrudRepository.verPersonas();
//        log.info("\n");
//        persons.forEach(personEntity -> {
//            log.info(personEntity.toString());
//        });

//        PersonEntity person = this.personCrudRepository.buscarPersona(3L);
//        log.info("\n");
//        log.info(person.toString());

//        this.personCrudRepository.insertarPersona("pepe","duarte");

//        this.personCrudRepository.actualizarPersona(17L,"jenny", "andrade");

        this.personCrudRepository.eliminarPersona(16L);
    }
}
