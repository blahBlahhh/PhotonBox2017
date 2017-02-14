package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FuelCollector extends Subsystem
{
	
	SpeedController fuelCollector;
	
	public FuelCollector()
	{
		fuelCollector= new Talon(RobotMap.fuelCollectorPort);
	}
	
	public void start()
	{
		fuelCollector.set(1);
	}
	
	public void stop()
	{
		fuelCollector.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}
