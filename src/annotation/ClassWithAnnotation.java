package annotation;
@MyOtherAnnotation(value = "/test")
public class ClassWithAnnotation {

    String title;
    public ClassWithAnnotation() {
        System.out.println("ClassWithAnnotation is exist");
    }

    @Override
    public String toString() {
        return "ClassWithAnnotation{" +
                "title='" + title + '\'' +
                '}';
    }
}
