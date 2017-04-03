package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CloseClaw extends Command
{

	public CloseClaw()
	{
		requires(Robot.gearCollector);
	}
	
	@Override
	protected void initialize()
	{
		Robot.gearCollector.close();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end()
	{
		
	}

}
