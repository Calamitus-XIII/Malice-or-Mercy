package net.mcreator.maliceormercy.procedures;

public class BleedingActiveTickConditionProcedure {
	public static boolean execute(double amplifier, double duration) {
		double baseRate = 0;
		double rateWithAmplifier = 0;
		baseRate = 100;
		rateWithAmplifier = baseRate - Math.pow(1, amplifier);
		if (Math.floor(rateWithAmplifier) > 0) {
			return duration % Math.floor(rateWithAmplifier) == 0;
		}
		return true;
	}
}
