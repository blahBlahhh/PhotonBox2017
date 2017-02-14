package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearBlueLeft extends CommandGroup
{
	public AutoGearBlueLeft()
	{
		addSequential(new DriveForward(-110.92, 1));
		addSequential(new DriveSwervely(60, 1));
		addSequential(new DriveForward(-42.01, 1));
		addSequential(new DeliverGear());
		addSequential(new DriveForward(15, 0.8));
	}
}
