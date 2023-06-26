package org.j2os.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "car")
@Table( name = "CAR")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column ( name = "CAR_ID", columnDefinition = "NUMBER")
    private Long carId;
    @Column ( name = "CAR_MODEL", columnDefinition = "VARCHAR2(20)")
    private String carModel;
    @Column ( name = "PERSON_ID" , columnDefinition = "NUMBER")
    private Long personId;
}
