// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.irontigers.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.irontigers.robot.Constants;
import frc.irontigers.robot.Constants.DriveVals.ModOne;
import frc.tigerlib.subsystem.drive.DifferentialDriveSubsystem;

public class DriveSystem extends SubsystemBase {
  /** Creates a new DriveSystem. */

  private CANSparkMax s1 = new CANSparkMax(Constants.DriveVals.ModOne.DRIVE_ONE, MotorType.kBrushless);
  private CANSparkMax d1 = new CANSparkMax(Constants.DriveVals.ModOne.STEER_ONE, MotorType.kBrushless);
  

  private CANSparkMax s2 = new CANSparkMax(Constants.DriveVals.ModTwo.DRIVE_TWO, MotorType.kBrushless);
  private CANSparkMax d2 = new CANSparkMax(Constants.DriveVals.ModTwo.STEER_TWO, MotorType.kBrushless);

  private CANSparkMax d3 = new CANSparkMax(Constants.DriveVals.ModThree.DRIVE_THREE, MotorType.kBrushless);
  private CANSparkMax s3 = new CANSparkMax(Constants.DriveVals.ModThree.STEER_THREE, MotorType.kBrushless);

  private CANSparkMax d4 = new CANSparkMax(Constants.DriveVals.ModFour.DRIVE_FOUR, MotorType.kBrushless);
  private CANSparkMax s4 = new CANSparkMax(Constants.DriveVals.ModFour.STEER_FOUR, MotorType.kBrushless);

  public DriveSystem() {
    d1.restoreFactoryDefaults();
    s1.restoreFactoryDefaults();
    d2.restoreFactoryDefaults();
    s2.restoreFactoryDefaults();
    d3.restoreFactoryDefaults();
    s3.restoreFactoryDefaults();
    d4.restoreFactoryDefaults();
    s4.restoreFactoryDefaults();

    d1.setIdleMode(IdleMode.kBrake);
    s1.setIdleMode(IdleMode.kBrake);
    d2.setIdleMode(IdleMode.kBrake);
    s2.setIdleMode(IdleMode.kBrake);
    d3.setIdleMode(IdleMode.kBrake);
    s3.setIdleMode(IdleMode.kBrake);
    d4.setIdleMode(IdleMode.kBrake);
    s4.setIdleMode(IdleMode.kBrake);

    

  }

  public void drive(double xSpeed, double rotation)
    {
      d1.set(xSpeed);
      s1.set(rotation);
    }
  
  @Override
  public void periodic() {
    
    
  }

  
}
