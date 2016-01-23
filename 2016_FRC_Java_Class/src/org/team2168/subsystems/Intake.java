package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.Intake.IntakeRetract;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * General intake subsystem to bring a ball into the robot.
 * Intake is actuated by a double solenoid.
 */
public class Intake extends Subsystem {
    
	DoubleSolenoid intakePiston;
	
	static Intake instance;
	
	/**
	 * Private constructor for Singleton Intake subsystem
	 */
	private Intake() {
		intakePiston = new DoubleSolenoid(RobotMap.intakeExtend,RobotMap.intakeRetract);
	}
	
	/**
	 * Returns a singleton object of Intake subsystem
	 * @return returns current intake object
	 */
	public static Intake getInstance() {
		if(instance == null)
			instance = new Intake();
		
		return instance;
	}
	
	/**
	 * Extends Intake piston to the down position
	 */
	public void extendIntake() {
		intakePiston.set(Value.kForward);
	}
	
	/**
	 * Retracts Intake piston to the up position
	 */
	public void retractIntake() {
		intakePiston.set(Value.kReverse);
	}
	
	/**
	 * Returns true if the Intake piston has been extended
	 * @return true when kForward, false otherwise
	 */
	public boolean isIntakeExtended() {
		return intakePiston.get() == Value.kForward;
	}
	
	/**
	 * Returns true if the Intake piston has been retracted
	 * @return true when kReverse, false otherwise
	 */
	public boolean isIntakeRetracted() {
		return intakePiston.get() == Value.kReverse;
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new IntakeRetract());
    }
}

