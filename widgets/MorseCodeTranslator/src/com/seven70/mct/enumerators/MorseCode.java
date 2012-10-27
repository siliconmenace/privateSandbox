package com.seven70.mct.enumerators;

import java.util.HashMap;
import java.util.Map;
import static com.seven70.mct.enumerators.Signals.*;

public enum MorseCode {
	A("A", new Signals[] { DOT, DASH }), B("B", new Signals[] { DASH, DOT, DOT,
			DOT }), C("C", new Signals[] { DASH, DOT, DASH, DOT }), D("D",
			new Signals[] { DASH, DOT, DOT }), E("E", new Signals[] { DOT }), F(
			"F", new Signals[] { DOT, DOT, DASH, DOT }), G("G", new Signals[] {
			DASH, DASH, DOT }), H("H", new Signals[] { DOT, DOT, DOT, DOT }), I(
			"I", new Signals[] { DOT, DOT }), J("J", new Signals[] { DOT, DASH,
			DASH, DASH }), K("K", new Signals[] { DASH, DOT, DASH }), L("L",
			new Signals[] { DOT, DASH, DOT, DOT }), M("M", new Signals[] {
			DASH, DASH }), N("N", new Signals[] { DASH, DOT }), O("O",
			new Signals[] { DASH, DASH, DASH }), P("P", new Signals[] { DOT,
			DASH, DASH, DOT }), Q("Q", new Signals[] { DASH, DASH, DOT, DASH }), R(
			"R", new Signals[] { DOT, DASH, DOT }), S("S", new Signals[] { DOT,
			DOT, DOT }), T("T", new Signals[] { DASH }), U("U", new Signals[] {
			DOT, DOT, DASH }), V("V", new Signals[] { DOT, DOT, DOT, DASH }), W(
			"W", new Signals[] { DOT, DASH, DASH }), X("X", new Signals[] {
			DASH, DOT, DOT, DASH }), Y("Y", new Signals[] { DASH, DOT, DASH,
			DASH }), Z("Z", new Signals[] { DASH, DASH, DOT, DOT });

	private String letter;
	private Signals[] code;
	private static Map<String, MorseCode> lookupMap = new HashMap<String, MorseCode>();

	static {
		for (MorseCode code : MorseCode.values()) {
			lookupMap.put(code.getLetter(), code);
		}
	}

	private MorseCode(String letter, Signals... signals) {
		this.letter = letter;
		this.code = signals;
	}

	public Signals[] getCode() {
		return code;
	}

	public String getLetter() {
		return letter;
	}

	public static MorseCode lookUp(String letter) {
		return lookupMap.get(letter.toUpperCase());
	}

	public static MorseCode lookUp(char _char) {
		return lookUp(Character.toString(_char));
	}

	public static String translate(String message) {

		MorseCode code = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			code = MorseCode.lookUp(message.charAt(i));
			if (code != null) {
				for (Signals signal : code.getCode()) {
					sb.append(signal.getSymbol());
				}
			}
			sb.append(" ");

		}
		return sb.toString().trim();
	}
}
