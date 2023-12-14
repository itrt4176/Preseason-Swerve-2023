// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.irontigers.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.irontigers.robot.Subsystems.DriveSystem;
import frc.tigerlib.XboxControllerIT;

public class DriveCommand extends CommandBase {
  /** Creates a new DriveCommand. */
  private DriveSystem driveSys;
  private XboxControllerIT control;
  public DriveCommand(DriveSystem driveSystem, XboxControllerIT controller) {
    driveSys = driveSystem;
    control = controller;
    addRequirements(driveSystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveSys.drive(control.getLeftY(), control.getRightX());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
