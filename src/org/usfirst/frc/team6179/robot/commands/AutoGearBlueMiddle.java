package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearBlueMiddle extends CommandGroup
{
	/**
	 * When the maxSpeed is 0.7, the distance counted by the encoder is tested to be most accurate.
	 */
	public AutoGearBlueMiddle()
	{
		addSequential(new DelayCompressor(), 3);			//TODO check if this works, 3s
		addSequential(new DriveForward(-74.93, 0.7), 2.5);	//TODO note down the time it uses, 3s
		addParallel(new DeliverGear(), 2);				//TODO check if the gear can be safely hung on the spring, 2s
		//Timer.delay(2);
		addSequential(new DriveForward(15, 0.7));			//TODO calculate the time that is left, 1s
	}
}
