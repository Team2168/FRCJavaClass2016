package org.team2168.subsystems;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *General intake system to bring a ball into the robot
 *Intake is actualized by a double solenoid
 */
public class Intake extends Subsystem {
    private DoubleSolenoid intakePiston;
    
    
    
    private static Intake instance = null;
    
    /**
     * Private constructor for the singleton intake subsystem
     */
    private Intake()
    {
    	intakePiston = new DoubleSolenoid(RobotMap.intakeRetract, RobotMap.intakeExtend);
    }
    /**
     * returns a singleton object of the intake subsystem
     * @return returns the current intake object
     */
    public static Intake getInstance()
    {
    	if(instance == null)
    		instance = new Intake();
    	
    	return instance;
    }
    /**
     * Extends the intake piston to the down position
     */
    public void extendIntake()
    {
    	intakePiston.set(Value.kForward);
    }
    /**
     * Retracts the intake piston to the up position
     */
    public void retractIntake()
    {
    	intakePiston.set(Value.kReverse);
    }
    
    /**
     * Returns true if the intake piston has been extended
     * @return true when kForward false otherwise
     */
    public boolean isIntakeExtended()
    {
    	return intakePiston.get() == Value.kForward;
    }
    /**
     * Returns true if the intake piston has been retracted
     * @return true when kReverse false otherwise
     */
    public boolean isIntakeRetracted()
    {
    	return intakePiston.get() == Value.kReverse;
    }
    
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

