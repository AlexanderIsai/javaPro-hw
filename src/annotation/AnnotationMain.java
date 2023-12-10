package annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class AnnotationMain {

    public static void main(String[] args)  {

        Package currentPackage = AnnotationMain.class.getPackage();
        String packageName = currentPackage.getName();
        String[] targetClasses = {"ClassWithAnnotation"};

        try {

            for (String targetClass : targetClasses) {
                String fullClassName = packageName + "." + targetClass;
                Class<?> cl = Class.forName(fullClassName);
                if (cl.isAnnotationPresent(MyOtherAnnotation.class)) {
                    Object object = cl.getDeclaredConstructor().newInstance();
                    fillObjectsFields(object);
                    System.out.println(object.toString());
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void fillObjectsFields(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            field.set(object, "TestName");
        }
    }
}
