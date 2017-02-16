package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveSwervely extends Command
{
	
	double angle;
	double turningSpeed;
	double error;
	double kP = 0.2;
	double kTolerance = 0.1;
	
	public DriveSwervely(double angle, double maxSpeed)
	{
		requires(Robot.oldDriver);
		this.angle = angle;
		this.turningSpeed = maxSpeed;
	}
	
	protected void initialize()
	{
		Robot.oldDriver.init();
	}
	
	protected void execute()
	{
		error = (angle - Robot.oldDriver.getAngle());
		//error = (Robot.oldDriver.getAngle() - angle);
		
		if(Math.abs(turningSpeed * kP * error) >= turningSpeed)
		{
			Robot.oldDriver.drive(0, turningSpeed*error/Math.abs(error), 0, 0);
		}
		else
		{
			Robot.oldDriver.drive(0, turningSpeed * kP * error, 0, 0);
		}
	}

	@Override
	protected boolean isFinished() {
		return Math.abs(error) <= kTolerance;
	}
	
	protected void end()
	{
		Robot.oldDriver.stop();
	}
	
	protected void interrupted()
	{
		end();
	}
	
	

}
