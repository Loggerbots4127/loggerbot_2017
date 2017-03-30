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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveSpeedControllerL;
    public static SpeedController driveSpeedControllerR;
    public static RobotDrive driveTank4WheelRobotDrive;
    public static SpeedController winchWinchController;
    public static AnalogGyro analogGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSpeedControllerL = new Talon(0);
        LiveWindow.addActuator("Drive", "Speed Controller Right", (Talon) driveSpeedControllerR);
        
        driveSpeedControllerR = new Talon(1);
        LiveWindow.addActuator("Drive", "Speed Controller Left", (Talon) driveSpeedControllerL);
        
        driveTank4WheelRobotDrive = new RobotDrive(driveSpeedControllerL,driveSpeedControllerR);
        
        driveTank4WheelRobotDrive.setSafetyEnabled(true);
        driveTank4WheelRobotDrive.setExpiration(0.1);
        driveTank4WheelRobotDrive.setSensitivity(0.5);
        driveTank4WheelRobotDrive.setMaxOutput(1.0);

        winchWinchController = new Talon(6);
        LiveWindow.addActuator("Winch", "Winch Controller", (Talon) winchWinchController);
        
        analogGyro = new AnalogGyro(0);
        analogGyro.calibrate();
        LiveWindow.addSensor("Drive", "Gyro", (AnalogGyro) analogGyro);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
