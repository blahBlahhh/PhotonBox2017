package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FuelShooter extends Subsystem
{
	
	SpeedController fuelShooter;

	public FuelShooter()
	{
		fuelShooter = new Victor(RobotMap.fuelShooterPort);
	}
	
	public void start()
	{
		fuelShooter.set(-0.86);
	}
	
	public void stop()
	{
		fuelShooter.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
