package it.ji.server.models;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Telephone} entity
 */
public class TelephoneDto implements Serializable {
    private final Long id;
    private final String number;

    public TelephoneDto(Long id, String number) {
        this.id = id;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneDto entity = (TelephoneDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.number, entity.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "number = " + number + ")";
    }
}