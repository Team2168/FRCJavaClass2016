package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.drivetrain.DriveWithJoysticksCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This object represents the drivetrain subsystem
 * the drivetrain has 6 talon motor controllers
 * 3 for the left, 3 for the right
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//Member variables for DT motor controllers
	private Talon leftMotor1;
	private Talon leftMotor2;
	private Talon leftMotor3;
	private Talon rightMotor1;
	private Talon rightMotor2;
	private Talon rightMotor3;
	
	static Drivetrain instance = null;
	
	/**
	 * Default constructor for Drivetrain singleton class
	 */
	private Drivetrain(){
		
		leftMotor1 = new Talon(RobotMap.leftDriveTrain1);
		leftMotor2 = new Talon(RobotMap.leftDriveTrain2);
		leftMotor3 = new Talon(RobotMap.leftDriveTrain3);
		rightMotor1 = new Talon(RobotMap.rightDriveTrain1);
		rightMotor2 = new Talon(RobotMap.rightDriveTrain2);
		rightMotor3 = new Talon(RobotMap.rightDriveTrain3);
	}
	
	/**
	 * returns Drivetrain Singleton Object
	 * @return Drivetrain object
	 */
	public static Drivetrain getInstance(){
		
		if(instance == null)
			instance = new Drivetrain();
		
		return instance;
	}

	/**
	 * Takes in a double as speed and sets it to the left motors
	 * @param speed is of type double from 1 to -1
	 */
	public void driveLeft(double speed){
		
		if(RobotMap.reverseLeft)
			speed = -speed; 
		
		leftMotor1.set(speed);
		leftMotor2.set(speed);
		leftMotor3.set(speed);
	}	
	
	/**
	 * Takes in a double speed and sets it to the right motors
	 * @param speed is of type double from 1 to -1
	 */
	public void driveRight(double speed){
		
		if(RobotMap.reverseRight)
			speed = -speed; 
		
		rightMotor1.set(speed);
		rightMotor2.set(speed);
		rightMotor3.set(speed);
	}
	
	/**
	 * Takes in a speed for the left and right drivetrain motors and
	 * sets them to their corresponding motors 
	 * @param speedRight is a type double from 1 to -1
	 * @param speedLeft is a type double from 1 to -1
	 */
	public void driveBoth(double speedRight, double speedLeft){
		
		driveRight(speedLeft);
		driveLeft(speedRight);
	}
	
	
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticksCommand());
    }
}

