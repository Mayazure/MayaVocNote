package maya.vocnote.adapter;

public class VAdapter {

	private VAdapterCallback vAdapterCallback;

	public VAdapter(){

	}

	public VAdapter(VAdapterCallback vAdapterCallback){
		this.vAdapterCallback = vAdapterCallback;
	}
	
	public void setAdapterCallback(VAdapterCallback vAdapterCallback){
		this.vAdapterCallback = vAdapterCallback;
	}
	
	public void search(String word){
		
	}
	
	public void note(String wordAndInfo){
		
	}
}
