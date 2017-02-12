package org.usfirst.frc.team6179.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static int fuelCollectorPort = 0;
	public static int fuelShooterPort = 1;
	public static int fuelBlenderPort = 3;
	public static int fuelDelivererPort = 4;

	public static int rightForwardSolenoidPort = 0;
	public static int rightReverseSolenoidPort = 1;
	public static int leftForwardSolenoidPort = 2;
	public static int leftReverseSolenoidPort = 3;
	
	public static int rightMotorPort = 6;
	public static int leftMotorPort = 7;
	
	public static int ropeClimberPort = 2;
	
	
	public static int rightEncoderPortA = 0;
	public static int rightEncoderPortB = 1;
	public static int rightEncoderIndexPort = 2;
	public static int leftEncoderPortA = 3;
	public static int leftEncoderPortB = 4;
	public static int leftEncoderIndexPort = 5;
}
