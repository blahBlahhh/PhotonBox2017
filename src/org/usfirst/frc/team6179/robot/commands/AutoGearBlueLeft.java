package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearBlueLeft extends CommandGroup
{
	public AutoGearBlueLeft()
	{
		Timer.delay(3);
		addSequential(new DelayCompressor());
		addSequential(new DriveForward(-91.235, 0.5),4.96);
		addSequential(new DriveSwervely(-60, 0.7));
		addSequential(new DriveForward(-22.325, 0.5),1.213);	  //distance = actual distance - half Robot length
		addSequential(new OpenClaw(),2);						  //TODO undecided time
		addSequential(new DriveForward(15, 0.5),1);		  //TODO undecided distance (15>Spring Length(10.5))
		addSequential(new CloseClaw(),2);
	}
}
