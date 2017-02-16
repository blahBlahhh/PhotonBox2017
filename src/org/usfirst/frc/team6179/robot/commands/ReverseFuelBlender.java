package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6179.robot.Robot;

public class ReverseFuelBlender extends Command {

	public ReverseFuelBlender(){
		requires(Robot.fuelBlender);
	}

	@Override
	protected void initialize()
	{
		Robot.fuelBlender.reverse();
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
		Robot.fuelBlender.stop();
	}

	@Override
	protected void interrupted()
	{
		end();
	}

}
