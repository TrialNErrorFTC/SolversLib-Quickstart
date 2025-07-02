package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.InstantCommand;
import com.seattlesolvers.solverslib.command.SequentialCommandGroup;
import com.seattlesolvers.solverslib.command.ParallelCommandGroup;

import org.firstinspires.ftc.teamcode.SubsystemConstants;
import org.firstinspires.ftc.teamcode.subsystems.AngleSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.ExtensionSubsystem;

/**
 * A complex auto command that drives forward,
 * releases a stone, and then drives backward.
 */
public class MoveToHighClip extends SequentialCommandGroup {

    private static final double INCHES = 3.0;
    private static final double SPEED = 0.5;

    public MoveToHighClip(AngleSubsystem angle, ExtensionSubsystem extension) {
        addCommands(
                new ParallelCommandGroup(
                        new AngleToHighClip(angle), // Extend the angle to the high clip position
                        new InstantCommand(() -> {
                            extension.extendTo((SubsystemConstants.ANGLE_HIGH_CLIP_TARGET - angle.getCurrentPosition()) * SubsystemConstants.ANGLE_TO_EXTENSION_TICK_CONVERSION); // Extend the extension to the high clip position
                        })
                ),
                new ExtendToHighClip(extension) // Extend the extension to the high clip position
        );
        addRequirements(angle, extension);
    }

}