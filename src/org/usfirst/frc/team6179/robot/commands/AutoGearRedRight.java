package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearRedRight extends CommandGroup
{
	public AutoGearRedRight()
	{
		//Timer.delay(3);								//TODO need to be revised after testing
		//addSequential(new DelayCompressor());
		addSequential(new DriveForward(-81.435, 0.7),3);   //52.6cm =====>133.6inches ..-81.435
		addSequential(new DriveSwervely(-60, 0.7),1.5);      //Counterclockwise 60 degrees
															//TODO undecided angle
		addSequential(new DriveForward(-41.925, 0.7),2.3);    //8.82cm======>22.4inches ..-41.925
		addSequential(new OpenClaw(),2); 			   //remember to close it after autonomous period!
		//Timer.delay(4); 							   //TODO Revise after testing
		addSequential(new DriveForward(15, 0.7),4);
		addSequential(new CloseClaw(),2);
	}
}
