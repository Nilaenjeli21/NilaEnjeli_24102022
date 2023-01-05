/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_24102022;

/**
 *
 * @author Nila Enjeni
 */
public class Hewancontroller {
    private Hewan model; 
	private HewanView view; 
	public Hewancontroller(Hewan model, HewanView view){ 
	
            this.model = model; 
		this.view = view; 
	} 
	public void setHewanJenis(String jenis){ 
		model.setJenis(jenis); 
	} 
	public String getHewanJenis(){ 
		return model.getJenis(); 
	} 
	public void setHewanName(String name){ 
		model.setName(name); 
	} 
	public String getHewanName(){ 
		return model.getName(); 
	} 
	public void updateView(){ 
		view.printHewanDetails(model.getJenis(), model.getName()); 
	} 
}
