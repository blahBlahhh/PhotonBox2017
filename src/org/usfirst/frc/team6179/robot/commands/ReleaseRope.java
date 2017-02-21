package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6179.robot.Robot;

public class ReleaseRope extends Command {

	public ReleaseRope()
	{
		requires(Robot.ropeClimber);
	}
	
	@Override
	protected void initialize() 
	{
		Robot.ropeClimber.release();
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
