package dev;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dev.ihm.Menu;

public class AppSpringXML {
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config-fichier.xml")) {
            // récupération du bean Menu
            Menu menu = context.getBean(Menu.class);

            menu.afficher();
        }
	}
}
