package me.eartharoid.staffchat;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	// start
	public void onEnable() {
		Logger logger = getLogger();


		logger.info("Plugin Enabled");

	}

	// stop
	public void onDisable() {
		Logger logger = getLogger();

		logger.info("Plugin Disabled");

	}

}
