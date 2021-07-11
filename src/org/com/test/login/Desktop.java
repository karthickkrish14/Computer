package org.com.test.login;

public class Desktop implements HardWare,Software {
private void desktopModel() {
System.out.println("HP");
}

@Override
public void softwareResources() {
System.out.println("IT");	
}

@Override
public void hardwareResources() {
System.out.println("Network");	
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources();
}
}
