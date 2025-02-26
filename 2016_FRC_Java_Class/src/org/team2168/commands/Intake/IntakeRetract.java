package org.team2168.commands.Intake;

import org.team2168.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Command which retracts the intake piston
 */
public class IntakeRetract extends Command {

    public IntakeRetract() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.intake.retractIntake();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.intake.isIntakeRetracted();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
