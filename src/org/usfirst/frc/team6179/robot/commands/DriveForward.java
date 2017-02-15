package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveForward extends Command
{
	
	double distance;
	double error;
	double driveForwardSpeed;
	double kP = -0.2;
	double kTolerance = 0.1;
	
	public DriveForward(double distance, double maxSpeed)
	{
		requires(Robot.oldDriver);
		this.distance = distance;
		this.driveForwardSpeed = maxSpeed;
	}
	
	protected void initialize()
	{
		Robot.oldDriver.init();
	}
	
	protected void execute()
	{
		error = (distance - Robot.oldDriver.getRightDistance());
		double angle = Robot.oldDriver.getAngle();
		
		if (driveForwardSpeed * kP * error >= driveForwardSpeed)
		{
			if(angle>5||angle<-5) Robot.oldDriver.drive(driveForwardSpeed * error/Math.abs(error), angle/Math.abs(angle), 0, 0);
			else Robot.oldDriver.drive(driveForwardSpeed * error/Math.abs(error), angle*0.2, 0, 0);
		} 
		else 
		{
			if(angle>10||angle<-10) Robot.oldDriver.drive(driveForwardSpeed * kP * error, angle/Math.abs(angle), 0, 0);
			else Robot.oldDriver.drive(driveForwardSpeed * kP * error, angle*0.1, 0, 0);
		}
		
	}

	@Override
	protected boolean isFinished()
	{
		// TODO Auto-generated method stub
		return Math.abs(error) <= kTolerance;
	}
	
	@Override
	protected void end()
	{
		Robot.oldDriver.stop();
	}

}
