package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollector extends Subsystem
{
	
	DoubleSolenoid solenoid;
	
	public GearCollector()
	{
		solenoid = new DoubleSolenoid(RobotMap.forwardSolenoidPort,RobotMap.reverseSolenoidPort);
	}
	
	public void open()
	{
		solenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void close()
	{
		solenoid.set(DoubleSolenoid.Value.kForward);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
