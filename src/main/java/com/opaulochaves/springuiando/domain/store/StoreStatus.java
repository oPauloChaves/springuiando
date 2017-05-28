package com.opaulochaves.springuiando.domain.store;

/**
 *
 * @author paulo
 */
public enum StoreStatus {

    ACTIVE("active"), INACTIVE("inactive");

    private String name;

    private StoreStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
