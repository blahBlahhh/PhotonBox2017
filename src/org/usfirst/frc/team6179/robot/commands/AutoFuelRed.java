package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoFuelRed extends CommandGroup
{
	public AutoFuelRed()
	{
		Timer.delay(3);
		addSequential(new DelayCompressor());
		addSequential(new DriveForward(-70, 0.8));
		addSequential(new DriveSwervely(-45, 0.5));			//TODO undecided angle
		addSequential(new DriveForward(83.065, 0.8));
		addSequential(new ShootFuel());
	}
}
