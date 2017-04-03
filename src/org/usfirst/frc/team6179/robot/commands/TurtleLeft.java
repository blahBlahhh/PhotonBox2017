package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurtleLeft extends Command
{
	public TurtleLeft()
	{
		requires(Robot.oldDriver);
	}
	
	@Override
	protected void initialize()
	{
		
	}
	
	@Override
	protected void execute()
	{
		Robot.oldDriver.drive(0, -0.2, 0, 0);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end()
	{
		Robot.oldDriver.drive(0, 0, 0, 0);
	}
	
	@Override
	protected void interrupted()
	{
		
	}

}
