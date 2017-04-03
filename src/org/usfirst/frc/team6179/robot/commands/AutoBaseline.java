package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoBaseline extends CommandGroup {

	public AutoBaseline()
	{
		addSequential(new DriveForward(-55,0.5),10);
	}
}
