/**
 * 
 */
package pl.plzspring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.plzspring.player.Player;

/**
 * @author Administrator
 *
 */
public class MainApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = getAppContext();

		Player player = getBean(context, Player.class);

		System.out.println(player.getStatisticForPlayer().getType().getCode());

		context.close();
	}

	private static AnnotationConfigApplicationContext getAppContext() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainAppConfig.class);
		return context;
	}

	public static <T> T getBean(ApplicationContext appContext, Class<T> beanClass) {
		T objBean = (T) appContext.getBean(beanClass);

		return objBean;
	}
}
