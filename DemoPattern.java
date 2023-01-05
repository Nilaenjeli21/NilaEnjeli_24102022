/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_24102022;

/**
 *
 * @author Nila Enjeli
 */
public class DemoPattern {
     public static void main(String[] args) { 
	
	Hewan model = retriveHewanFromDatabase(); 
	
	//Create a view : to write student details on console 
	HewanView view = new HewanView(); 
	Hewancontroller Controller = new Hewancontroller(model, view); 	
        Controller.updateView(); 

	//update model data 
	Controller.setHewanName("Kucing"); 
	Controller.updateView(); 
	} 

	private static Hewan retriveHewanFromDatabase(){ 
	Hewan hewan = new Hewan(); 
	hewan.setName("Kelinci"); 
	hewan.setJenis("Hewan Di Darat"); 
	return hewan; 
	} 
}
