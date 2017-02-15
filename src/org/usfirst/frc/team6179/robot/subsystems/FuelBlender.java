package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FuelBlender extends Subsystem
{
	
	SpeedController fuelBlender;
	
	public FuelBlender()
	{
		fuelBlender = new Victor(RobotMap.fuelBlenderPort);
	}
	
	public void start()
	{
		fuelBlender.set(0.8);
	}
	
	public void stop()
	{
		fuelBlender.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
