package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OpenClaw extends Command
{
	
	public OpenClaw()
	{
		requires(Robot.gearCollector);
	}
	
	@Override
	protected void initialize()
	{
		Robot.gearCollector.open();
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
