/*
 * Author: Curtis Warren
 * Date: 06/20/18
 * Description: This program test runs the Camera class.
 * This program is used as an example of object-oriented program by Curtis A. Warren II.
 *
 */
public class TestCamera {

	public static void main(String[] args) {

		// Our first object!!!
		Camera ourFirstCamera = new Camera ();

		Camera ourSecondCamera = new Camera ("Cool Camera", "551234", false, 5500);
		//  Allows us to view the initial states of our cameras.
		System.out.println (ourFirstCamera.toString());

		System.out.println (ourSecondCamera.toString());

		//  Sets a new name and modelNumber for the ourFirstCamera object.
		ourFirstCamera.setName("Our First Camera");
		ourFirstCamera.setModelNumber("12345678");
		//  Clears the capacity for the ourFirstCamera object.
		ourFirstCamera.clearCapacity();
		//  Allow us to view the changes made to ourFirstCamera in the console.
		System.out.println (ourFirstCamera.toString());


		/* Here we take three pictures using ourSecondCamera object. */
		ourSecondCamera.takePicture();
		ourSecondCamera.takePicture();
		ourSecondCamera.takePicture();
		//  Checks to see the state of the ourSecondCamera object after taking three pictures.
		System.out.println (ourSecondCamera.toString());

		// Here we take a single picture with ourFirstCamera object.

		/*
		 * If ourFirstCamera has a capacity of 0 what do you think would be the result of
		 * this operation being performed with ourFirstCamera object .
		*/
		ourFirstCamera.takePicture();
		//  The status of the camera object is set to false, indicating that the camera is turned off.
		ourFirstCamera.setStatus(false);

		System.out.println (ourFirstCamera.toString());


	}

}
