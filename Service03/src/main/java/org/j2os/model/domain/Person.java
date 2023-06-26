package org.j2os.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity (name = "person")
@Table ( name = "PERSON")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    @Column ( name = "PERSON_ID", columnDefinition = "NUMBER")
    private Long personId;
    @Column ( name = "NAME", columnDefinition = "VARCHAR2(20)")
    private String name;
    @Column ( name = "FAMILY", columnDefinition = "VARCHAR2(20)")
    private String family;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PERSON_ID")
    private List<Car> cars;
}
