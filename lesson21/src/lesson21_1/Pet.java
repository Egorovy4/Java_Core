package lesson21_1;

public abstract class Pet {
	public void voice(String s, ToSound toSound) {
		toSound.sound(s);
	}
}