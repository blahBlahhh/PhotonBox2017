package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FuelDeliverer extends Subsystem
{
	
	SpeedController fuelDeliverer;
	
	public FuelDeliverer()
	{
		fuelDeliverer = new Victor(RobotMap.fuelDelivererPort);
	}
	
	public void start()
	{
		fuelDeliverer.set(1);
	}
	
	public void stop()
	{
		fuelDeliverer.disable();
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
