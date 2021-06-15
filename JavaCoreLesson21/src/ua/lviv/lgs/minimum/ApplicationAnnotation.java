package ua.lviv.lgs.minimum;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ApplicationAnnotation {
	public static void main(String[] args) {
		System.out.println("AnnotationValue");
		getAnnotationValue(Droid.class);
		System.out.println();
		System.out.println("NotAnnotationValue");
		getNotAnnotationValue(Droid.class);
		System.out.println();
		System.out.println("AnnotationMethod");
		getAnnotationMethod(Droid.class);

	}
	public static void getAnnotationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(MyAnnotaion.class) instanceof MyAnnotaion) {
				System.out.print(field.getName() + " -----  ");
				System.out.println(" annotaion value = " + field.getAnnotation(MyAnnotaion.class).value());
			}
		}
	}
	public static void getAnnotationMethod(Class<?> customClass) {

		Method[] methods = customClass.getDeclaredMethods();

		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];

			if (method.getAnnotation(MyAnnotaion.class) instanceof MyAnnotaion) {
				System.out.print(method.getName() + " -----  ");
				System.out.println(" annotaion value = " + method.getAnnotation(MyAnnotaion.class).value());
			}
		}
	}
	public static void getNotAnnotationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (!(field.getAnnotation(MyAnnotaion.class) instanceof MyAnnotaion)) {
				System.out.println(field.getType() + " " + field.getName() + " -----	 ");
			}
		}
	}
}
