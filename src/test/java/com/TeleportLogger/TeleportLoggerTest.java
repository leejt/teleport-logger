package com.TeleportLogger;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TeleportLoggerTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TeleportLoggerPlugin.class);
		RuneLite.main(args);
	}
}