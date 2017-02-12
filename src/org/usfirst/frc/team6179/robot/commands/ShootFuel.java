package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class ShootFuel extends Command {
	
	public ShootFuel(){
		requires(Robot.fuelShooter);
		requires(Robot.fuelBlender);
	}

	@Override
	protected void initialize()
	{
		Robot.fuelShooter.start();
		Timer.delay(0.5);
		Robot.fuelBlender.start();
		Robot.fuelDeliverer.start();
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
		Robot.fuelShooter.stop();
		Robot.fuelBlender.stop();
		Robot.fuelDeliverer.stop();
	}

	@Override
	protected void interrupted()
	{
		end();
	}

}
