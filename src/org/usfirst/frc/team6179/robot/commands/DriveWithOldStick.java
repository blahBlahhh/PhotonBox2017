package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithOldStick extends Command {
	
	public DriveWithOldStick(){
		requires(Robot.oldDriver);
	}

	@Override
	protected void initialize() {}

	@Override
	protected void execute() {
		Robot.oldDriver.drive(-Robot.oi.getStick().getY(),Robot.oi.getStick().getX(),-Robot.oi.getStick().getThrottle(),Robot.oi.getStick().getZ());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {
		end();
	}

}
