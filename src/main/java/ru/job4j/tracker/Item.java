package ru.job4j.tracker;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class Item {
    private int id;
    private String name;
    private final LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created + '}';
    }
}