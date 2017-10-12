package monteCarlo;

public class DrunkWalk {

	public static void main(String[] args) {
		double counter = 0.0;
		double trials = 100000.0;
		double probability;
		for (int i = 0; i < trials; i++) {
			if (!willHitTargetOnWalk(0, 0, 100)) {
				counter++;
			}
		}
		probability = (counter / trials) * 100;
		System.out.println(probability);
	}

	private static boolean willHitTargetOnWalk(int xTarget, int yTarget, int steps) {
		int x = 0;
		int y = 0;

		for (int i = 0; i < steps; i++) {
			int random = (int) (Math.random() * 4);
			if (random == 0) {
				x -= 1;
			} else if (random == 1) {
				x += 1;
			} else if (random == 2) {
				y -= 1;
			} else if (random == 3) {
				y += 1;
			}
			if (x == xTarget && y == yTarget) {
				return true;
			}
		}
		return false;

	}
}
