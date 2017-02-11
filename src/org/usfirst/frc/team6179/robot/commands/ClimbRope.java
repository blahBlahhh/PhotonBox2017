package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbRope extends Command {

	public ClimbRope()
	{
		requires(Robot.ropeClimber);
	}
	
	@Override
	protected void initialize() 
	{
		Robot.ropeClimber.start();
	}

	@Override
	protected void execute() 
	{
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.ropeClimber.stop();
	}

	@Override
	protected void interrupted() 
	{
		end();
	}

}
