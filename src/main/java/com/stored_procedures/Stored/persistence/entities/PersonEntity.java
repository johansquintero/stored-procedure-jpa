package com.stored_procedures.Stored.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "person")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@NamedStoredProcedureQuery(
        name="PersonEntity.verPersonas",
        procedureName = "verPersonas",
        resultClasses = PersonEntity.class
)

//@NamedStoredProcedureQuery(
//        name="PersonEntity.buscarPersona",
//        procedureName = "buscarPersona",
//        resultClasses = PersonEntity.class,
//        parameters = {
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "person_id",type = Long.class)
//        }
//)

//@NamedStoredProcedureQuery(
//        name="PersonEntity.insertarPersona",
//        procedureName = "insertarPersona",
//        parameters = {
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "name",type = String.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "last_name",type = String.class)
//        }
//)

//@NamedStoredProcedureQuery(
//        name="PersonEntity.actualizarPersona",
//        procedureName = "actualizarPersona",
//        parameters = {
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "person_id",type = Long.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "name",type = String.class),
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "last_name",type = String.class)
//        }
//)

//@NamedStoredProcedureQuery(
//        name = "PersonEntity.eliminarPersona",
//        procedureName = "eliminarPersona",
//        parameters = {
//                @StoredProcedureParameter(mode = ParameterMode.IN,name = "person_id",type = Long.class)
//        }
//)


public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
}
