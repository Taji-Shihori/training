package chap12;

class PetTester1 {

	public static void main(String[] args) {
		Pet kurt = new Pet("Kurt", "アイ");
		kurt.introduce();
		System.out.println();

		RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
		System.out.println();

		Pet p = r2d2;
		p.introduce();
	}

}
