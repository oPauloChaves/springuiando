package com.opaulochaves.springuiando.domain.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author paulo
 */
public interface StoreRepository extends JpaRepository<Store, Long> {

    @RestResource(exported = false)
    Store findByEmail(String email);

}
