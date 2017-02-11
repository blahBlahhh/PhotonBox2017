package org.usfirst.frc.team6179.robot.commands;

import org.usfirst.frc.team6179.robot.Robot;
import org.usfirst.frc.team6179.tools.Vector3D;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveForward extends Command
{
	
	double distance;
	Vector3D realDistance;
	double error;
	double driveForwardSpeed;
	double kP = 0.2;
	double lastTime;
	Vector3D v;
	
	public DriveForward(double distance, double driveForwardSpeed)
	{
		requires(Robot.oldDriver);
		this.distance = distance;
		this.driveForwardSpeed = driveForwardSpeed;
		v=new Vector3D(0,0,0);
		realDistance=new Vector3D(0,0,0);
	}
	
	protected void initialize()
	{
		Robot.oldDriver.init();
		lastTime = Timer.getFPGATimestamp();
	}
	
	protected void execute()
	{
		double dt = Timer.getFPGATimestamp() - lastTime;
		lastTime = Timer.getFPGATimestamp();
		Vector3D a = Robot.oldDriver.getAcc();
		realDistance = realDistance.add(v.mul(dt).add(a.mul(0.5*dt)));
		v = v.add(a.mul(dt));
		//Robot.oldDriver.getAngle();

		error = (distance - realDistance.mod());
		if (driveForwardSpeed * kP * error >= driveForwardSpeed)
		{
			Robot.oldDriver.drive(driveForwardSpeed, 0, 0, 0);
		}
		else
		{
			Robot.oldDriver.drive(driveForwardSpeed * kP * error, 0, 0, 0);
		}
		//Timer.delay(0.1);
		SmartDashboard.putNumber("distance x", realDistance.x);
		SmartDashboard.putNumber("distance y", realDistance.y);
		SmartDashboard.putNumber("distance z", realDistance.z);
		SmartDashboard.putNumber("v", v.mod());
		SmartDashboard.putNumber("a", a.mod());
		SmartDashboard.putNumber("t", dt);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
