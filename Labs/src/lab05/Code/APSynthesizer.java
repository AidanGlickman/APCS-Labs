package lab05.Code;

import javax.sound.midi.*;

public class APSynthesizer{
    Synthesizer synth = MidiSystem.getSynthesizer();
    synth.open();
    MidiChannel[] channels = synth.getChannels();

    private void playEvent(int[] event){

        int sleepTime = event[0];
        int state, channel, note, volume;

        for(int i = 1; i<event.length; i+=4){
            state = event[i];
            channel = event[i+1];
            note = event[i+2];
            volume = event[i+3];

            if(state == 0)
                channels[channel].noteOff(note);
            else
                channels[channel].noteOn(note, volume);
        }

        Thread.sleep(sleepTime);
    }

    public void play(int[][] song){
        for(int i = 0; i<song.length; i++)
            playEvent(song[i]);
    }
}