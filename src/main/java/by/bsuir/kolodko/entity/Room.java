package by.bsuir.kolodko.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class Room implements Entity {

    private Integer id;

    private String roomNumber;

    private Boolean occupied;

    public Room(Integer id, String roomNumber, Boolean occupied) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.occupied = occupied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id.equals(room.id) && roomNumber.equals(room.roomNumber) && occupied.equals(room.occupied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomNumber, occupied);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber='" + roomNumber + '\'' +
                ", occupied=" + occupied +
                '}';
    }
}
