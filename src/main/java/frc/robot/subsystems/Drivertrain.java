// RobotBuilder Version: 5.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drivertrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private CANSparkMax rightMotot1;
private CANSparkMax rightMotor2;
private MotorControllerGroup rightMotorGroup;
private CANSparkMax leftMotor1;
private CANSparkMax leftMotor2;
private MotorControllerGroup leftMotorGroup;
private DifferentialDrive differentialDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Drivertrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
rightMotot1 = new CANSparkMax(1, MotorType.kBrushless);
 
 rightMotot1.restoreFactoryDefaults();  
rightMotot1.setInverted(true);
rightMotot1.setIdleMode(IdleMode.kCoast);
rightMotot1.burnFlash();
  

rightMotor2 = new CANSparkMax(20, MotorType.kBrushless);
 
 rightMotor2.restoreFactoryDefaults();  
rightMotor2.setInverted(true);
rightMotor2.setIdleMode(IdleMode.kCoast);
rightMotor2.burnFlash();
  

rightMotorGroup = new MotorControllerGroup(rightMotot1, rightMotor2  );
 addChild("RightMotorGroup",rightMotorGroup);
 

leftMotor1 = new CANSparkMax(2, MotorType.kBrushless);
 
 leftMotor1.restoreFactoryDefaults();  
leftMotor1.setInverted(false);
leftMotor1.setIdleMode(IdleMode.kCoast);
leftMotor1.burnFlash();
  

leftMotor2 = new CANSparkMax(3, MotorType.kBrushless);
 
 leftMotor2.restoreFactoryDefaults();  
leftMotor2.setInverted(false);
leftMotor2.setIdleMode(IdleMode.kCoast);
leftMotor2.burnFlash();
  

leftMotorGroup = new MotorControllerGroup(leftMotor1, leftMotor2  );
 addChild("LeftMotorGroup",leftMotorGroup);
 

differentialDrive1 = new DifferentialDrive(rightMotorGroup, leftMotorGroup);
 addChild("Differential Drive 1",differentialDrive1);
 differentialDrive1.setSafetyEnabled(true);
differentialDrive1.setExpiration(0.1);
differentialDrive1.setMaxOutput(1.0);



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void my_DriveArchade(double speed, double turn) {
        differentialDrive1.arcadeDrive(speed, turn);    
    }

}

