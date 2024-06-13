package net.javaguides.springannotations;

import net.javaguides.springannotations.configurationproperties.AppPropertiesDemo;
import net.javaguides.springannotations.lazy.propertysource.PropertySourceDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);

		//EagerLoader eagerLoader = context.getBean(EagerLoader.class);

		//LazyLoader lazyLoader = context.getBean(LazyLoader.class);

//		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//
//		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//
//		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean3.hashCode());
//
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//
//		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());
//
//		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean3.hashCode());
//
//		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
//		System.out.println(valueAnnotationDemo.getDefaultName());
//		System.out.println(valueAnnotationDemo.getHost());
//		System.out.println(valueAnnotationDemo.getEmail());
//		System.out.println(valueAnnotationDemo.getPassword());
//		System.out.println(valueAnnotationDemo.getJavaHome());
//		System.out.println(valueAnnotationDemo.getHomeDir());

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppDesc());

		AppPropertiesDemo appPropertiesDemo = context.getBean(AppPropertiesDemo.class);
		appPropertiesDemo.display();
	}

}
