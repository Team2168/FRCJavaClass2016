package org.team2168.subsystems;

import org.team2168.commands.Drivetrain.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Drivetrain Subsystem
 */
public class Drivetrain extends Subsystem {
	
	public static Drivetrain instance = null;
	
	private Talon left1;
	private Talon left2; 
	private Talon left3; 
	private Talon right1; 
	private Talon right2;
	private Talon right3; 
	
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Drivetrain(){
		
		left1 = new Talon(0);
		left2 = new Talon(1);
		left3 = new Talon(2);
		right1 = new Talon(3);
		right2 = new Talon(4);
		right3 = new Talon(5);
	}
	
	/**
	 * Returns the instance of the drivetrain singleton class
	 * @return Drivetrain Subsystem Object
	 */
	public static Drivetrain getInstance(){
		
		if(instance == null)
			instance = new Drivetrain();
		
		return instance;
	}
	
	/**
	 * Drives left side of drivetrain
	 * @param speed value from -1 to 1
	 */
	public void driveLeft(double speed){
		
		left1.set(speed);
		left2.set(speed);
		left3.set(speed);
	}
	
	/**
	 * Drive right side of drivetrain
	 * @param speed value form -1 to 1
	 */
	public void driveRight(double speed){
		
		right1.set(speed);
		right2.set(speed);
		right3.set(speed);
	}
	
	/**
	 * Drives drivetrain left and right
	 * @param leftSpeed speed value for left from -1 to 1
	 * @param rightSpeed speed value for right from -1 to 1
	 */
	public void drive(double leftSpeed, double rightSpeed){
		
		driveLeft(leftSpeed);
		driveRight(rightSpeed);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());
    }
}
