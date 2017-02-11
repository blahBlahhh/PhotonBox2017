package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CollectFuel extends Command {
	
	public CollectFuel()
	{
		requires(Robot.fuelCollector);
	}

	@Override
	protected void initialize()
	{
		Robot.fuelCollector.start();
	}

	@Override
	protected void execute()
	{
		
	}

	@Override
	protected boolean isFinished()
	{
		return false;
	}

	@Override
	protected void end()
	{
		Robot.fuelCollector.stop();
	}

	@Override
	protected void interrupted()
	{
		end();
	}

}
