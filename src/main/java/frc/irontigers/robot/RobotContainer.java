// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.irontigers.robot;

import edu.wpi.first.wpilibj.GenericHID;
import frc.irontigers.robot.Subsystems.DriveSystem;
import frc.tigerlib.XboxControllerIT;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here..
  private final XboxControllerIT controller = new XboxControllerIT(0);
  private final DriveSystem driveSystem = new DriveSystem();
  private final DriveCommand driveCommand = new DriveCommand(driveSystem, controller);

  private final Trigger upShift = controller.rightBumper();
  private final Trigger downShift = controller.leftBumper();
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    driveSystem.setDefaultCommand(driveCommand);
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxControllerIT}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    upShift.onTrue(new InstantCommand(() -> driveSystem.gearUp()));
    downShift.onTrue(new InstantCommand(() -> driveSystem.gearDown()));
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return null;
  }
}
