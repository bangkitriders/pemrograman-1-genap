package Praktikum11a.bin;

class User{
	public static void main(String[] bangkit){
		TV02 tv02 = new TV02();
		TV01 tv01 = new TV01();
		Remote RM = new Remote();
		
		System.out.println();
		RM.PerintahTV(Remote.PINDAHLINE,tv01,3);
		RM.PerintahTV(Remote.VOLBESAR,tv01,12);

		System.out.println();
		RM.PerintahTV(Remote.PINDAHLINE,tv02,4);
		RM.PerintahTV(Remote.VOLKECIL,tv02,2);

	}
}