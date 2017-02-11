package org.usfirst.frc.team6179.robot.subsystems;

import org.usfirst.frc.team6179.robot.RobotMap;
import org.usfirst.frc.team6179.tools.Vector3D;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer.Range;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OldDriver extends Subsystem
{
	
	SpeedController rightMotor;
	SpeedController leftMotor;
	RobotDrive drive;
	ADXRS450_Gyro gyro;
	BuiltInAccelerometer acc;
	
	public OldDriver()
	{
		rightMotor = new Victor(RobotMap.rightMotorPort);
		leftMotor = new Victor(RobotMap.leftMotorPort);
		drive = new RobotDrive(leftMotor,rightMotor);
		gyro = new ADXRS450_Gyro();
		acc = new BuiltInAccelerometer();
		gyro.calibrate();
	}
	
	public void init()
	{
		gyro.reset();
		acc.setRange(Range.k2G);
	}
	
	public double getAngle()
	{
		return gyro.getAngle();
	}
	
	public Vector3D getAcc()
	{
		//SmartDashboard.putNumber("X", Math.floor((acc.getX()-0.004)*100)/100);
		//SmartDashboard.putNumber("Y", Math.floor((acc.getY()+0.02)*100)/100);
		//SmartDashboard.putNumber("Z", Math.floor((acc.getZ()-1.02)*100)/100);
		SmartDashboard.putNumber("X", acc.getX());
		SmartDashboard.putNumber("Y", acc.getY()+0.02);
		SmartDashboard.putNumber("Z", acc.getZ()-1.02);
		return new Vector3D(acc.getX(),acc.getY()+0.02,acc.getZ()-1.02).mul(100).floor().div(100);
	}
	
	public void drive(double HongKongMoveValue,double HongKongRotateValue,double WesternMoveValue,double WesternRotateValue)
	{
		double MoveValue = HongKongMoveValue + 0.5*WesternMoveValue;
		double RotateValue = HongKongRotateValue + 0.5*WesternRotateValue;
		if(MoveValue > 1)	MoveValue = 1;
		if(RotateValue > 1) RotateValue = 1;
		if(MoveValue < -1)	MoveValue = -1;
		if(RotateValue < -1) RotateValue = -1;
		
		drive.arcadeDrive(MoveValue, RotateValue);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
