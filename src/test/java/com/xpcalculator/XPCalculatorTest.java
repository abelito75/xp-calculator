package com.xpcalculator;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class XPCalculatorTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(XPCalculatorPlugin.class);
		RuneLite.main(args);
	}
}