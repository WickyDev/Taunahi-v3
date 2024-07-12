package net.taunahi_v3.ezskyblock.feature;

public interface IFeature {
    String getName();

    boolean isRunning();

    boolean shouldPauseMacroExecution();

    boolean shouldStartAtMacroStart();

    void start();

    void stop();

    void resetStatesAfterMacroDisabled();

    boolean isToggled();

    boolean shouldCheckForFailsafes();
}
