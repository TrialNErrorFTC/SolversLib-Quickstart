package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.SubsystemConstants;
import org.firstinspires.ftc.teamcode.subsystems.ExtensionSubsystem;


public class ExtendToHighClip extends CommandBase {

    // The subsystem the command runs on
    private final ExtensionSubsystem extensionSubsystem;

    public ExtendToHighClip(ExtensionSubsystem subsystem) {
        extensionSubsystem = subsystem;
        addRequirements(extensionSubsystem);
    }

    @Override
    public void initialize() {
        extensionSubsystem.extendTo(SubsystemConstants.EXTEND_HIGH_CLIP_TARGET); // TODO: Change number
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}