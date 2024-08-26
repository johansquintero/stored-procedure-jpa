package com.stored_procedures.Stored.persistence.crud;

import com.stored_procedures.Stored.persistence.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonCrudRepository extends JpaRepository<PersonEntity, Long> {

    /*======== verPersonas ========*/
//    Forma 1
    @Procedure(name = "PersonEntity.verPersonas")
    List<PersonEntity> verPersonas();
//    forma 2
//    @Query(value = "CALL verPersonas();", nativeQuery = true)
//    List<PersonEntity> verPersonas();
//        forma 3
//    @Procedure(name = "verPersonas")
//    List<PersonEntity> verPersonas();
//    forma 4
//    @Procedure
//    List<PersonEntity> verPersonas();



    /*======== buscarPersona ========*/
//    forma 1
//    @Procedure("PersonEntity.buscarPersona")
//    PersonEntity buscarPersona(@Param("person_id") Long personId);

//    forma 2
    @Query(value = "CALL buscarPersona(:person_id);",nativeQuery = true)
    PersonEntity buscarPersona(@Param("person_id") Long personId);

//    forma 3
//    @Procedure(name = "buscarPersona")
//    PersonEntity buscarPersona(@Param("person_id") Long personId);

//    forma 4
//    @Procedure
//    PersonEntity buscarPersona(@Param("person_id") Long personId);


    /*======== insertarPersona ========*/
//        forma 1
//    @Procedure("PersonEntity.insertarPersona")
//    void insertarPersona(@Param("name") String name,@Param("last_name") String lastName);

//        forma 2
//    @Modifying//:Indica que la consulta realiza una operación de modificación en la base de datos (como INSERT, UPDATE o DELETE).
//    @Query(value = """
//            CALL insertarPersona(:name, :last_name);
//            """, nativeQuery = true)
//    void insertarPersona(@Param("name") String name, @Param("last_name") String lastName);

//    forma 3
    @Procedure(name = "insertarPersona")
    void insertarPersona(@Param("name") String name, @Param("last_name") String lastName);

//    forma 4
//    @Procedure
//    void insertarPersona(@Param("name") String name, @Param("last_name") String lastName);

    /*======== actualizarPersona ========*/
//        forma 1
//    @Procedure("PersonEntity.actualizarPersona")
//    void actualizarPersona(@Param("person_id") Long personId, @Param("name") String name, @Param("last_name") String lastName);

    //        forma 2
//    @Modifying//Indica que la consulta realiza una operación de modificación en la base de datos (como INSERT, UPDATE o DELETE).
//    @Query(value = """
//            CALL actualizarPersona(:person_id,:name, :last_name);
//            """, nativeQuery = true)
//    void actualizarPersona(@Param("person_id") Long personId, @Param("name") String name, @Param("last_name") String lastName);

//    forma 3
//    @Procedure(name = "actualizarPersona")
//    void actualizarPersona(@Param("person_id") Long personId, @Param("name") String name, @Param("last_name") String lastName);

//    forma 4
    @Procedure
    void actualizarPersona(@Param("person_id") Long personId, @Param("name") String name, @Param("last_name") String lastName);

    /*======== eliminarPersona ========*/
//        forma 1
//    @Procedure("PersonEntity.actualizarPersona")
//    void eliminarPersona(@Param("person_id") Long personId);

    //        forma 2
//    @Modifying//Indica que la consulta realiza una operación de modificación en la base de datos (como INSERT, UPDATE o DELETE).
//    @Query(value = "CALL eliminarPersona(:person_id);", nativeQuery = true)
//    void eliminarPersona(@Param("person_id") Long personId);

//    forma 3
//    @Procedure(name = "eliminarPersona")
//    void eliminarPersona(@Param("person_id") Long personId);

    //    forma 4
    @Procedure
    void eliminarPersona(@Param("person_id") Long personId);


}
