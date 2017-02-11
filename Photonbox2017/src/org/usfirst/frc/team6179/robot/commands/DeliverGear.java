
package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DeliverGear extends Command {

	public DeliverGear()
	{
		requires(Robot.gearCollector);
	}
	
	@Override
	protected void initialize()
	{
		Robot.gearCollector.open();
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
		Robot.gearCollector.close();
	}

	@Override
	protected void interrupted()
	{
		end();
	}

}
