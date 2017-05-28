package com.opaulochaves.springuiando.domain.store;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author paulo
 */
@Entity
@Getter
@Setter
public class Store implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Integer version;

    @NotEmpty
    private String name;

    @Column(unique = true)
    @Email
    @NotEmpty
    private String email;

    @Enumerated(EnumType.STRING)
    @NotNull
    private StoreStatus status;
}
