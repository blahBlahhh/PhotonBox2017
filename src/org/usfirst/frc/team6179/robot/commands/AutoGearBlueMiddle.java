package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearBlueMiddle extends CommandGroup
{
	public AutoGearBlueMiddle()
	{
		addSequential(new DriveForward(-74.93, 1));
		addSequential(new DeliverGear());
		Timer.delay(2);
		addSequential(new DriveForward(15,0.8));
	}
}
