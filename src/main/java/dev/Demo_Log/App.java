package dev.Demo_Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("Bonjour Slf4j !");
		LOG.info("Implementation Logback");
		new AppService().executer("valeur 1");
	}
}
