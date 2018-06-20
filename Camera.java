/*
 * Author: Curtis Warren
 * Date: 06/20/18
 * Description: This program defines the Camera class which has getter and setter methods.
 * Additional methods are also defines here to demonstrate the power of object-oriented programming and design.
 * This program is used as an example of object-oriented program by Curtis A. Warren II.
 *
 */
public class Camera {

	//  Holds commercial name.
	private String name;

	//  Holds unique model number
	private String modelNumber;

	// Holds on/off status.
	private boolean status;

	//  Holds number of photos and videos
	//  that the camera can hold.
	private int storageCapacity;

	//  Default constructor.
	public Camera () {

		this.name = "Demo Camera";
		this.modelNumber = "ABCD1234";
		this.status = true;
		this.storageCapacity = 2500;

	}

	//  Our second constructor.
	public Camera (String newName, String newModelNumber, boolean newStatus, int newStorageCapacity) {

		this.name = newName;
		this.modelNumber = newModelNumber;
		this.status = newStatus;

		if (newStorageCapacity < 0 ){
			System.out.println("The storage capacity must always be a positive integer or zero.");
		}
		else
		{
		this.storageCapacity = newStorageCapacity;
		}
	}


	//	Retrieves the name of the camera.
	public String getName ()  {

	return this.name;

	}

	//  Sets the name of the camera.
	public void setName (String newName)  {

		this.name = newName;

	}

	//	Retrieves the model number of the camera.
	public String getModelNumber ()  {

		return this.modelNumber;

	}
	//  Sets the model number of the camera.
	public void setModelNumber (String newModelNumber)  {

		this.modelNumber = newModelNumber;

	}

	//	Retrieves status of the camera (on or off).
	public boolean getStatus ()  {

	return this.status;

	}
	//	Returns status message on or off.
	public String getStatusMessage()  {

		if (getStatus())
		{
			return "ON";
		}
		else
		{
			return "OFF";
		}

	}

	//  Sets the status of the camera, true = on false = off.
	public void setStatus (boolean newStatus)  {

		this.status = newStatus;

	}
	//  	Retrieves the capacity of the camera.
	public int getCapacity ()  {

		return this.storageCapacity;

		}

	//  Sets the capacity of the camera.
	public void setCapacity (int newStorageCapacity)  {
		if (newStorageCapacity < 0)
		{
			System.out.println("The storage capacity must always be a positive integer or zero.");
		}
		else
		{

		this.storageCapacity = newStorageCapacity;

		}
	}

	//  Clears the capacity of the camera.
	public void clearCapacity ()  {

		this.storageCapacity = 0;

	}


	public void takePicture ()  {

		//  Adjusting storage capacity.

		if (this.storageCapacity >= 1)
		{
			this.storageCapacity--;
		}
		else
		{
			System.out.println("Storage capacity exceeded!");
			System.out.println("Memory Full.");
		}

		//  Implementation to take a picture.
	}

	@Override
	public String toString() {


		return "Name of Camera: " + getName() + "\n" + "Current Capacity: "
		+ getCapacity() + "\n" + "Model Number: " + getModelNumber() + "\n" +
		"Camera Status: " + getStatusMessage()  + "\n";

	}



}
