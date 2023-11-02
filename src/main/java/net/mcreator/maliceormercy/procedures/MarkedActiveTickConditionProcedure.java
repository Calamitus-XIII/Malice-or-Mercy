package net.mcreator.maliceormercy.procedures;

public class MarkedActiveTickConditionProcedure {
	public static boolean execute(double amplifier, double duration) {
		double baseRate = 0;
		double rateWithAmplifier = 0;
		baseRate = 200;
		rateWithAmplifier = baseRate + Math.pow(200, amplifier);
		if (Math.floor(rateWithAmplifier) > 0) {
			return duration % Math.floor(rateWithAmplifier) == 0;
		}
		return true;
	}
}
