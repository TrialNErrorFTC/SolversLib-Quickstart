package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.SubsystemConstants;
import org.firstinspires.ftc.teamcode.subsystems.AngleSubsystem;


public class AngleToHighClip extends CommandBase {

    // The subsystem the command runs on
    private final AngleSubsystem angleSubsystem;

    public AngleToHighClip(AngleSubsystem subsystem) {
        angleSubsystem = subsystem;
        addRequirements(angleSubsystem);
    }

    @Override
    public void initialize() {
        angleSubsystem.angleTo(SubsystemConstants.ANGLE_HIGH_CLIP_TARGET); // TODO: Change number
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}

