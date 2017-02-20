package org.usfirst.frc.team6179.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6179.robot.Robot;

public class DelayCompressor extends Command {

    public DelayCompressor () {
        requires(Robot.gearCollector);
    }

    @Override
    protected void initialize () {
        Robot.gearCollector.stopCompressing();
    }

    @Override
    protected void execute() {

    }
    @Override
    protected void end () {
        Robot.gearCollector.startCompressing();
    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }

    @Override
    protected void interrupted () {
        end();
    }
}
