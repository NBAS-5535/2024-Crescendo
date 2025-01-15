// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Climb;

public class ClimbUpCommand extends Command {
  private final Climb climb;
  
  /** Creates a new ClimbUpCommand. */
  public ClimbUpCommand(Climb climb) {
    this.climb = climb;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    climb.climbUp();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    climb.stopClimb();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return climb.getLimitSwitchTop();
  }
}
