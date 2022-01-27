/*===============================================
    กแกแกแ ภฺนูภว มึฟไ(ม฿ฟไ) ลฌทกฝบ กแกแกแ
===============================================*/

// Object ลฌทกฝบ

class NewCar
{
	private int velocity;		//-- ภฺตฟย๗ภว ผำตต
	private int wheelNum;		//-- ภฺตฟย๗ภว นูฤ๛ ฐนผ๖
	private String carName;		//-- ภฺตฟย๗ฏM ภฬธง

	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}
}



public class Test131
{
	public static void main(String[] args)
	{
		NewCar nCar1 = new NewCar(80, "พฦนÝถผ", 4);
		NewCar nCar2 = new NewCar(150, "ฑืทฃภ๚", 4);
		
		// equals()
		System.out.println("1-1 : " + nCar1.equals(nCar2));
		System.out.println("1-2 : " + (nCar1 == nCar2));
		//--==>> 1-1 : false
		//		 1-2 : false

		NewCar nCar3 = nCar1;		// ฐดรผ บนป็ กๆ พ่ภบ ภวนฬ บนป็(ยüมถวü)
									// กๆ มึผาฐช บนป็

		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		//--==>> 2-1 : true
		//	     2-2 : true

		
		// toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		//--==>> 3-1 : NewCar@15db9742
		//		 3-2 : NewCar@6d06d69c
		//		 3-3 : NewCar@15db9742


		// hashCode()
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		//--==>>4-1 : 366712642
		//		4-2 : 1829164700
		//		4-3 : 366712642
		//-- ฐแฐ๚ฐชภป 16ม๘ผ๖ วüลยทฮ นูฒูฐิ ตวธ้
		//	 กบtoString()กป ธÞผาตๅฐก นÝศฏวั ฐแฐ๚ฐช ศฎภฮ ฐกดษ.



		// getClass()
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		//--==>> 5-1 : class NewCar
		//		 5-2 : class NewCar
		//		 5-3 : class NewCar
		//-- ปýผบตศ ฐดรผธฆ ล๋วุ
		//	 วุด็ ฐดรผภว ฑโนÝ ผณฐ่ตตธฆ ศฎภฮวา ผ๖ ภึดย ฑโดษภป ฐกม๘ ธÞผาตๅ

		// clone()			//-- ฐดรผ บนป็

		// finalize()		//-- ฐดรผ ม๗ทฤศญ

		// ฑโลธ ณชธำม๖ ธÞผาตๅดย ฝบทนตๅ รณธฎฟอ ฐüทรภฬ ภึดู.(ฝบทนตๅดย ภฯดÜ พศวฯฐํ ภฅ ดูวฯธ้ วฯฐฺดู)

	}
}