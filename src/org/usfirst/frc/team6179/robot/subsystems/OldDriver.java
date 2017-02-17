package org.usfirst.frc.team6179.robot.subsystems;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team6179.robot.RobotMap;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class OldDriver extends Subsystem
{
	
	SpeedController rightMotor;
	SpeedController leftMotor;
	RobotDrive drive;
	ADXRS450_Gyro gyro;
	Encoder leftEncoder;
	Encoder rightEncoder;
	
	public OldDriver()
	{
		rightMotor = new Talon(RobotMap.rightMotorPort);
		leftMotor = new Talon(RobotMap.leftMotorPort);
		drive = new RobotDrive(leftMotor,rightMotor);

		//leftEncoder = new Encoder(RobotMap.leftEncoderPortA,RobotMap.leftEncoderPortB,RobotMap.leftEncoderIndexPort);
		//rightEncoder = new Encoder(RobotMap.leftEncoderPortA,RobotMap.rightEncoderPortB,RobotMap.rightEncoderIndexPort);

        leftEncoder = new Encoder(RobotMap.leftEncoderPortA,RobotMap.leftEncoderPortB,false,EncodingType.k4X);
        leftEncoder.setIndexSource(RobotMap.leftEncoderIndexPort);
		rightEncoder = new Encoder(RobotMap.rightEncoderPortA,RobotMap.rightEncoderPortB,true,EncodingType.k4X);
		rightEncoder.setIndexSource(RobotMap.rightEncoderIndexPort);

		leftEncoder.setDistancePerPulse(0.0376991118);
		rightEncoder.setDistancePerPulse(0.0376991118);
		
		rightEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
		leftEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
		
		gyro = new ADXRS450_Gyro();
		gyro.calibrate();

		LiveWindow.addActuator("Old Driver", "Left Motor", (Talon) leftMotor);
		LiveWindow.addActuator("Old Driver", "Right Motor", (Talon) rightMotor);
		LiveWindow.addSensor("Encoder", "Left Encoder", leftEncoder);
		LiveWindow.addSensor("Encoder", "Right Encoder", rightEncoder);
		LiveWindow.addSensor("Gyro", "Gyro", gyro);
	}
	
	public void init()
	{
		gyro.reset();
		leftEncoder.reset();
		rightEncoder.reset();
	}
	
	public double getAngle()
	{
		return gyro.getAngle();
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
	
	public double getLeftDistance() {
		return leftEncoder.getDistance();
	}

	public double getRightDistance() {
		return rightEncoder.getDistance();
	}
	
	public int getLeftRaw() {
		return leftEncoder.getRaw();
	}
	
	public int getRightRaw() {
		return rightEncoder.getRaw();
	}
	
	public void stop(){
		drive(0,0,0,0);
	}

	@Override
	protected void initDefaultCommand() {

	}

}
