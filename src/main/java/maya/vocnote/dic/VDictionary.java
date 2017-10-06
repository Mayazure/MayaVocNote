package maya.vocnote.dic;

import maya.vocnote.net.VHttpClient;

public abstract class VDictionary {

	protected VHttpClient vHttpClient;
	
	public abstract String search();
}
