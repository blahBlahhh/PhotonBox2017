package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearBlueMiddle extends CommandGroup
{
	public AutoGearBlueMiddle()
	{
		addSequential(new DriveForward(-114.3, 1));
		addSequential(new DeliverGear());
		addSequential(new DriveForward(15,0.8));
	}
}
