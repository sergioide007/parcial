package parcial.desing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import common.Util;

public class Online {

	public static String comprar() throws IOException {
		Util.outputInLine("Keyboard - Enter String:");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferedReader.readLine();
	}

}