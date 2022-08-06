package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz.getSimpleName());

        System.out.println(clazz.getSuperclass().getSimpleName());

        try {

            Arrays.stream(clazz.getInterfaces()).
                    map(Class::getSimpleName).
                    forEach(System.out::println);


            Constructor<Reflection> declaredConstructors = clazz.getConstructor();
            Reflection reflection = declaredConstructors.newInstance();

            System.out.println(reflection);

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException exception){
            System.out.println(exception.getMessage());
        }
    }
}
