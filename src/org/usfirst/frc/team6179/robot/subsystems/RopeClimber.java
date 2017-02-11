package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RopeClimber extends Subsystem
{
	
	SpeedController ropeClimber;
	
	public RopeClimber()
	{
		ropeClimber = new Talon(RobotMap.ropeClimberPort);
	}
	
	public void start()
	{
		ropeClimber.set(1);
	}
	
	public void stop()
	{
		ropeClimber.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
