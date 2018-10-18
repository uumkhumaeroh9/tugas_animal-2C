public class AnimalTest{

	public static void main(String[] args) {
		Animal a=new Animal();
		Cat cat=new Cat(); //karena harus ada instansiasi
		a.breath();
		cat.grow();
		cat.mencakar();
		Cow cow=new Cow(); //karena harus ada instansiasi
		cow.breath();
		cow.grow();
		cow.menanduk();
	}
}