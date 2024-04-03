package lp.solutions.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public abstract class DtoToMap {

    public static Map<String, Object> map(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        Map<String, Object> mapData = new HashMap<>();
        for (Field field: fields) {
            field.setAccessible(true);
            mapData.put(field.getName(), field.get(object));
        }
        return mapData;
    }
}
