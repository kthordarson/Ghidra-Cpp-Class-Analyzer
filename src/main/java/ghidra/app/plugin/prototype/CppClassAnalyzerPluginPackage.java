package ghidra.app.plugin.prototype;

import ghidra.framework.plugintool.util.PluginPackage;

import resources.ResourceManager;

public class CppClassAnalyzerPluginPackage extends PluginPackage {

	public static final String NAME = "Ghidra C++ Class Analyzer";
	private static final String DESCRIPTION = "These plugins are for analyzing C++ Classes.";

	public CppClassAnalyzerPluginPackage() {
		super(NAME, ResourceManager.loadImage("images/c++-icon.png"), DESCRIPTION);
	}

}