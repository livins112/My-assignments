package org.system;

public class Desktop extends Computer {
	public void desktopSize() {

		System.out.println("Screen Size: 27 inches");
	}

	public static void main(String[] args) {

		// Single Inheritance//
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();

	}

}
