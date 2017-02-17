package org.usfirst.frc.team6179.robot.subsystems;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Cameras extends Subsystem
{
	
	public Cameras()
	{
		CameraServer.getInstance().startAutomaticCapture("camera for Shooter", 0);
		CameraServer.getInstance().startAutomaticCapture("camera for Gear", 1);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
