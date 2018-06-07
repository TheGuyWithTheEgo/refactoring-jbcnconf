package pl.refactoring.ex_dictaphone.states;

import pl.refactoring.ex_dictaphone.Dictaphone;
import pl.refactoring.ex_dictaphone.Engine;

public class OffState extends State {
    @Override
    public void handlePower(Dictaphone dictaphone) {
        dictaphone.setState(STOPPED_STATE);
        dictaphone.moveEngineWithHeadPutAway(Engine.TAPE_STOPPED);
    }

}
