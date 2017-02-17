package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearBlueLeft extends CommandGroup
{
	public AutoGearBlueLeft()
	{
		addSequential(new DriveForward(-91.235, 0.8));      //TODO undecided speed
		addSequential(new DriveSwervely(60, 0.8));		  //TODO undecided angle
		addSequential(new DriveForward(-22.325, 0.8));	  //distance = actual distance - half Robot length
		addSequential(new DeliverGear());
		Timer.delay(2);									  //TODO undecided time
		addSequential(new DriveForward(15, 0.8));		  //TODO undecided distance (15>Spring Length(10.5))
	}
}
