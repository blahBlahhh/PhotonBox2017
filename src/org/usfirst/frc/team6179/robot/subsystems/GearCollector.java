package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollector extends Subsystem
{
	
	DoubleSolenoid rightSolenoid;
	DoubleSolenoid leftSolenoid;
	
	public GearCollector()
	{
		rightSolenoid = new DoubleSolenoid(RobotMap.rightForwardSolenoidPort,RobotMap.rightReverseSolenoidPort);
		leftSolenoid = new DoubleSolenoid(RobotMap.leftForwardSolenoidPort,RobotMap.leftReverseSolenoidPort);
	}
	
	public void open()
	{
		rightSolenoid.set(DoubleSolenoid.Value.kReverse);
		leftSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void close()
	{
		rightSolenoid.set(DoubleSolenoid.Value.kForward);
		leftSolenoid.set(DoubleSolenoid.Value.kForward);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
