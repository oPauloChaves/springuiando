package com.opaulochaves.springuiando.domain.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author paulo
 */
@Getter
@Setter
@AllArgsConstructor
public class Store {
    
    private Long id;
    
    private String name;
    
    private StoreStatus status;
}
