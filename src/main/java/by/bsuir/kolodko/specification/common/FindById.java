package by.bsuir.kolodko.specification.common;

import by.bsuir.kolodko.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindById implements Specification {

    private final Integer id;

    public FindById(Integer id) {
        this.id = id;
    }

    @Override
    public String toSql() {
        return "WHERE id = ?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(id);
    }
}
