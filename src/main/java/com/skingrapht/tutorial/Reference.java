package com.skingrapht.tutorial;

public class Reference {

	public static final String MOD_ID="stm";
	public static final String NAME="tutorial";
    public static final String VERSION="1.0";		
    public static final String ACCEPTED_VERSION="[1.11.2]";
    
    public static final String CLIENT_PROXY_CLASS = "com.skingrapht.tutorial.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.skingrapht.tutorial.proxy.ServerProxy";
    
    public static enum TutorialItems{
    	OBSIDIANINGOT("Obsidianingot", "ItemObsidianingot");
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	TutorialItems(String unlocalizedName, String registryName)
    	{
    	this.unlocalizedName = unlocalizedName;
    	this.registryName = registryName;
    	}
    	
    	public String getUnloacalizedName()
    	{
    	return unlocalizedName;
    	}
    	public String getRegistryName()
    	{
    	return registryName;	
    	}
    }
}
