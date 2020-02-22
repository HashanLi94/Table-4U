package com.springboot.restuarant.Table4U.ResEntity;

import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.ResTable;

import javax.persistence.Table;

public class ResTableEntity {

    private ResTable table;
    private boolean availability;

    public ResTable getTable() {
        return table;
    }

    public void setTable(ResTable table) {
        this.table = table;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
