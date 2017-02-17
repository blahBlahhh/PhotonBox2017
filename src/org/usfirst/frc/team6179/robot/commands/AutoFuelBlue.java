package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoFuelBlue extends CommandGroup
{
	public AutoFuelBlue()
	{
		addSequential(new DriveForward(-70, 0.8));
		addSequential(new DriveSwervely(45, 0.8));
		addSequential(new DriveForward(83.065, 0.8));
		addSequential(new ShootFuel());
	}
}
