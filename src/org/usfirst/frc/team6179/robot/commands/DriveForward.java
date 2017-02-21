package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveForward extends Command
{
	
	double distance;
	double error;
	double driveForwardSpeed;
	double kDP = 0.2;
	double kAP = 0.2;
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
		
		SmartDashboard.putNumber("distance error", error);
		
		double angle = Robot.oldDriver.getAngle();
		
		if (Math.abs(driveForwardSpeed * kDP * error) >= driveForwardSpeed){
			if(Math.abs(angle*kAP)>1) Robot.oldDriver.drive(driveForwardSpeed * error/Math.abs(error), angle/Math.abs(angle), 0, 0);
			else Robot.oldDriver.drive(driveForwardSpeed * error/Math.abs(error), angle*kAP, 0, 0);
		} else {
			if(Math.abs(angle*kAP)>1) Robot.oldDriver.drive(driveForwardSpeed * kDP * error, angle/Math.abs(angle), 0, 0);
			else Robot.oldDriver.drive(driveForwardSpeed * kDP * error, angle*kAP, 0, 0);
		}
		
	}

	@Override
	protected boolean isFinished()
	{
		return Math.abs(error) <= kTolerance;
	}
	
	@Override
	protected void end()
	{
		Robot.oldDriver.stop();
	}
	
	@Override
	protected void interrupted(){
		end();
	}

}
