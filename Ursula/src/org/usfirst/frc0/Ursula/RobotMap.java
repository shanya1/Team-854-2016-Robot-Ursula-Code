// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc0.Ursula;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

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
    public static SpeedController shooterIntakeMotor;
    public static SpeedController shooterLeftShooterMotor;
    public static SpeedController shooterRightShooterMotor;
    public static Encoder shooterLeftShooterEncoder;
    public static Encoder shooterRightShooterEncoder;
    public static SpeedController driveTrainLeftDriveMotor;
    public static SpeedController driveTrainRightDriveMotor;
    public static RobotDrive driveTrainRobotDrive21;
    public static Encoder driveTrainLeftDriveEncoder;
    public static Encoder driveTrainRightDriveEncoder;
    public static SpeedController armArmMotor;
    public static DigitalInput armLowerLimitSwitch;
    public static DigitalInput armUpperLimitSwitch;
    public static DigitalInput shooterLimitSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterIntakeMotor = new Victor(2);
        LiveWindow.addActuator("Shooter", "Intake Motor", (Victor) shooterIntakeMotor);
        
        shooterLeftShooterMotor = new Victor(3);
        LiveWindow.addActuator("Shooter", "Left Shooter Motor", (Victor) shooterLeftShooterMotor);
        
        shooterRightShooterMotor = new Victor(4);
        LiveWindow.addActuator("Shooter", "Right Shooter Motor", (Victor) shooterRightShooterMotor);
        
        shooterLeftShooterEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "Left Shooter Encoder", shooterLeftShooterEncoder);
        shooterLeftShooterEncoder.setDistancePerPulse(1.0);
        shooterLeftShooterEncoder.setPIDSourceType(PIDSourceType.kRate);
        shooterRightShooterEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "Right Shooter Encoder", shooterRightShooterEncoder);
        shooterRightShooterEncoder.setDistancePerPulse(1.0);
        shooterRightShooterEncoder.setPIDSourceType(PIDSourceType.kRate);
        driveTrainLeftDriveMotor = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Left Drive Motor", (Talon) driveTrainLeftDriveMotor);
        
        driveTrainRightDriveMotor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Right Drive Motor", (Talon) driveTrainRightDriveMotor);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainLeftDriveMotor, driveTrainRightDriveMotor);
        
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);

        driveTrainLeftDriveEncoder = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Left Drive Encoder", driveTrainLeftDriveEncoder);
        driveTrainLeftDriveEncoder.setDistancePerPulse(1.0);
        driveTrainLeftDriveEncoder.setPIDSourceType(PIDSourceType.kRate);
        driveTrainRightDriveEncoder = new Encoder(8, 9, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Right Drive Encoder", driveTrainRightDriveEncoder);
        driveTrainRightDriveEncoder.setDistancePerPulse(1.0);
        driveTrainRightDriveEncoder.setPIDSourceType(PIDSourceType.kRate);
        armArmMotor = new Talon(5);
        LiveWindow.addActuator("Arm", "Arm Motor", (Talon) armArmMotor);
        
        armLowerLimitSwitch = new DigitalInput(4);
        LiveWindow.addSensor("Arm", "Lower Limit Switch", armLowerLimitSwitch);
        
        armUpperLimitSwitch = new DigitalInput(5);
        LiveWindow.addSensor("Arm", "Upper Limit Switch", armUpperLimitSwitch);
        
        shooterLimitSwitch = new DigitalInput(6);
        LiveWindow.addSensor("Shooter", "Shooter Limit Switch", shooterLimitSwitch);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
