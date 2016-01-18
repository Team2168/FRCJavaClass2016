package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.drivetrain.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This object represents the drivetrain subsystem
 * The drivetrain had 6 Talon Motor Contollers
 * 3 for the left, 3 for the right
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Talon leftMotor1;
	private Talon leftMotor2;
	private Talon leftMotor3;
	private Talon rightMotor1;
	private Talon rightMotor2;
	private Talon rightMotor3;
	
	static Drivetrain instance = null;
	
	private Drivetrain() {
		leftMotor1 = new Talon(RobotMap.leftDriveTrain1);	
		leftMotor2 = new Talon(RobotMap.leftDriveTrain2);
		leftMotor3 = new Talon(RobotMap.leftDriveTrain3);
		rightMotor1 = new Talon(RobotMap.rightDriveTrain1);
		rightMotor2 = new Talon(RobotMap.rightDriveTrain2);
		rightMotor3 = new Talon(RobotMap.rightDriveTrain3);	
	}
	
	/**
	 * Returns Drivetrain singleton object
	 * @return current drivetrain object
	 */
	public static Drivetrain getInstance() {
		if(instance == null)
			instance = new Drivetrain();
				
		return instance;
	}

	/**
	 * Drives left side of drivetrain using double speed input
	 * @param double speed (1 to -1)
	 */
	public void driveLeft(double speed) {
		if(RobotMap.reversedLeft)			
			speed = -speed;

			leftMotor1.set(speed);
			leftMotor2.set(speed);
			leftMotor3.set(speed);
	}
	
	/**
	 * Drives right side of drivetrain using double speed input
	 * @param double speed (1 to -1)
	 */
	public void driveRight(double speed) {
		if(RobotMap.reversedRight)			
			speed = -speed;
			
			rightMotor1.set(speed);
			rightMotor2.set(speed);
			rightMotor3.set(speed);
	}
	
	/**
	 * Drives full drivetrain using double leftSpeed and rightSpeed input
	 * @param double leftSpeed (1 to -1)
	 * @param double rightSpeed (1 to -1)
	 */
	public void tankDrive(double leftSpeed, double rightSpeed) {
		driveLeft(leftSpeed);
		driveRight(rightSpeed);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand( new DriveWithJoysticks());
    }
}

