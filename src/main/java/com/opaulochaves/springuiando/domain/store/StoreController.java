package com.opaulochaves.springuiando.domain.store;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author paulo
 */
@Slf4j
@RestController
public class StoreController {

    static final Map<Long, Store> STORES = new HashMap<>();

    static {
        STORES.put(1l, new Store(1l, "First", "first@store.com", StoreStatus.ACTIVE));
        STORES.put(2l, new Store(2l, "Second", "second@store.com", StoreStatus.ACTIVE));
        STORES.put(3l, new Store(3l, "Third", "third@store.com", StoreStatus.INACTIVE));
        STORES.put(4l, new Store(4l, "Fourth", "fourth@store.com", StoreStatus.ACTIVE));
    }

    @GetMapping(path = "/stores", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<Long, Store> index() {
        return STORES;
    }

    @GetMapping(path = "/stores/{storeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Store> getStore(@PathVariable Long storeId) {
        if (!STORES.containsKey(storeId)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(STORES.get(storeId));
    }
}
