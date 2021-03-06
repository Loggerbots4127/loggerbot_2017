// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4127.Loggerbots;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private XboxController xBoxUSB;
    private AnalogGyro analogGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
     
        xBoxUSB = new XboxController(0);
        
        analogGyro = new AnalogGyro(1);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public double getX_R() {
    	return xBoxUSB.getX(Hand.kRight);
    }

    public double getY_R() {
    	return xBoxUSB.getY(Hand.kRight);
    }
    
    public double getX_L() {
    	return xBoxUSB.getX(Hand.kLeft);
    }
    
    public double getY_L() {
    	return xBoxUSB.getY(Hand.kLeft);
    }
    
    public double getRThrottle() {
    	return xBoxUSB.getTriggerAxis(Hand.kRight);
    }
 
    public double getLThrottle() {
    	return xBoxUSB.getTriggerAxis(Hand.kLeft);
    }
 
    
    public boolean getAButton() {
    	return xBoxUSB.getAButton();
    }
    
    public boolean getBButton() {
    	return xBoxUSB.getBButton();
    }
    
    public boolean getXButton() {
    	return xBoxUSB.getXButton();
    }
    
    public boolean getYButton() {
    	return xBoxUSB.getYButton();
    }
    
    public double getHeading() {
    	return analogGyro.getAngle();
    }
    
    public void calibrateGyro() {
    	analogGyro.calibrate();
    }
    


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

