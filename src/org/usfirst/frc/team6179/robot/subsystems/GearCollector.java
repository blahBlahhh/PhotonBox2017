package org.usfirst.frc.team6179.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team6179.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearCollector extends Subsystem
{
	Compressor compressor;
	DoubleSolenoid solenoid;
	
	public GearCollector()
	{
		solenoid = new DoubleSolenoid(RobotMap.forwardSolenoidPort,RobotMap.reverseSolenoidPort);
		compressor = new Compressor();

		LiveWindow.addActuator("Gear Collector", "Solenoid", solenoid);
	}
	
	public void open()
	{
		solenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void close()
	{
		solenoid.set(DoubleSolenoid.Value.kForward);
	}

	public void startCompressing() {
		compressor.start();
	}

	public void stopCompressing () {
		compressor.stop();
	}

	@Override
	protected void initDefaultCommand() {

	}

}
