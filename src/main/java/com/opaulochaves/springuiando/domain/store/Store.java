package com.opaulochaves.springuiando.domain.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author paulo
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    
    private Long id;
    
    private String name;
    
    private String email;
    
    private StoreStatus status;
}
