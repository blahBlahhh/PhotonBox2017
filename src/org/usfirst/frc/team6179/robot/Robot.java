
package org.usfirst.frc.team6179.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6179.robot.commands.DriveForward;
import org.usfirst.frc.team6179.robot.commands.DriveWithOldStick;
import org.usfirst.frc.team6179.robot.subsystems.FuelBlender;
import org.usfirst.frc.team6179.robot.subsystems.FuelCollector;
import org.usfirst.frc.team6179.robot.subsystems.FuelDeliverer;
import org.usfirst.frc.team6179.robot.subsystems.FuelShooter;
import org.usfirst.frc.team6179.robot.subsystems.GearCollector;
import org.usfirst.frc.team6179.robot.subsystems.OldDriver;
import org.usfirst.frc.team6179.robot.subsystems.RopeClimber;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static FuelBlender fuelBlender = new FuelBlender();
	public static FuelDeliverer fuelDeliverer = new FuelDeliverer();
	public static FuelShooter fuelShooter = new FuelShooter();
	public static FuelCollector fuelCollector = new FuelCollector();
	public static GearCollector gearCollector = new GearCollector();
	public static RopeClimber ropeClimber = new RopeClimber();
	public static OldDriver oldDriver = new OldDriver();

//	Command autonomousCommand;
//	SendableChooser<Command> chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {

		SmartDashboard.putData(oldDriver);
		SmartDashboard.putData(gearCollector);

		oi = new OI();

	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		new DriveForward(30, 1).start();
//		autonomousCommand = chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
//		if (autonomousCommand != null)
//			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
//		if (autonomousCommand != null)
//			autonomousCommand.cancel();
		new DriveWithOldStick().start();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}

	private void log() {
		SmartDashboard.putNumber("Left Encoder Distance", oldDriver.getLeftDistance());
		SmartDashboard.putNumber("Right Encoder Distance", oldDriver.getRightDistance());
		SmartDashboard.putNumber("Gyro", oldDriver.getAngle());
		SmartDashboard.putNumber("Left Encoder Raw Counter", oldDriver.getLeftRaw());
		SmartDashboard.putNumber("Right Encoder Raw Counter", oldDriver.getRightRaw());
	}
}
