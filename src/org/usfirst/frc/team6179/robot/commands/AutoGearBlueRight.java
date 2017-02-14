package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearBlueRight extends CommandGroup
{
	public AutoGearBlueRight()
	{
		addSequential(new DriveForward(-101.12, 1));   //52.6cm =====>133.6inches
		addSequential(new DriveSwervely(-60, 1));      //Counterclockwise 60 degrees
		addSequential(new DriveForward(-61.81, 1));    //8.82cm======>22.4inches
		addSequential(new DeliverGear()); 			   //remenber to close it after autonomous period!
		Timer.delay(2); 							   //TODO Revise after testing
		addSequential(new DriveForward(15, 0.8));
	}
}
