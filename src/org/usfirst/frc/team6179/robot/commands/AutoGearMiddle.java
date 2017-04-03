package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGearMiddle extends CommandGroup
{
	/**
	 * When the maxSpeed is 0.7, the distance counted by the encoder is tested to be most accurate.
	 */
	public AutoGearMiddle()
	{
		//addSequential(new DelayCompressor(), 3);			//TODO check if this works, 3s
		addSequential(new DriveForward(-50, 0.5), 2.72);	//TODO note down the time it uses, 3s
		addSequential(new OpenClaw(),2.3);					//TODO check if the gear can be safely hung on the spring, 2s
		//Timer.delay(2);
		addSequential(new DriveForward(15, 0.5),2);			//TODO calculate the time that is left, 1s
		addSequential(new CloseClaw(),2);
	}
}
